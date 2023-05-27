package org.breadsb.sandbox.collections;

import org.breadsb.sandbox.exceptions.StreamNotExistException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CollectionSandbox {

    enum ENEMY_SORTING {
        LEVEL,
        REWARD
    }

    public static final void streamIsNotReusable() {
        try {
            LongStream ls = LongStream.of(1L, 2L, 3L);
            System.out.println(ls.min());
            System.out.println(ls.max());
        } catch (IllegalStateException e) {
            throw new StreamNotExistException("Stream was already closed", e);
        } finally {
            System.out.println("Closing process");
        }
    }

    public static List<Integer> reuseStreamUsingSupplier() {
        Supplier<IntStream> supplier = ()->IntStream.of(17, 20, 29, 7);
        List<Integer> list = new ArrayList<>();
        list.add(supplier.get().min().orElse(0));
        list.add(supplier.get().max().orElse(10));
        return list;
    }

    protected static List<Integer> creatingUnmodifiableList() {
        List<Integer> list = Stream.of(5, 9, 11).collect(Collectors.collectingAndThen(Collectors.toList(), (l) -> Collections.unmodifiableList(l)));
        try {
            list.add(10);
            return list;
        } catch (UnsupportedOperationException e) {
            System.out.println("Error occured: cannot add element to unmodifiable list!");
            return list;
        }
    }

    protected static List<Enemy> sortingEnemy (List<Enemy> enemyList, ENEMY_SORTING sortType) {
        switch (sortType) {
            case LEVEL -> {
                EnemyLevelComparator elc = new EnemyLevelComparator();
                Collections.sort(enemyList, elc);
                return enemyList;
            }
            case REWARD -> {
                Collections.sort(enemyList);
                return enemyList;
            }
            default -> {
                System.out.println("Not sorted!");
                return enemyList;
            }
        }
    }
}