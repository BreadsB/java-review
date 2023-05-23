package org.breadsb.sandbox.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnemyTestSuite {

    @Test
    void sortEnemiesByLevelInSet() {

        Enemy enemy1 = new Enemy("Standard", 17, 500.0);
        Enemy enemy2 = new Enemy("High", 20, 414.0);
        Enemy enemy3 = new Enemy("Highest", 30, 714.0);

        EnemyLevelComparator elc = new EnemyLevelComparator();

        Set<Enemy> enemySet = new TreeSet<>(elc);
        enemySet.add(enemy3);
        enemySet.add(enemy1);
        enemySet.add(enemy2);

        Set<Enemy> expected = new TreeSet<>();
        expected.add(enemy2);
        expected.add(enemy1);
        expected.add(enemy3);

//        enemySet = enemySet.stream().sorted().collect(Collectors.toSet());
//        enemy2, enemy1, enemy3 - reward
//        enemy1, enemy2, enemy3

        assertEquals(expected, enemySet);
    }

    @Nested
    class innerEnemySortingTests {
        Enemy boss, viceBoss, knight, peasant;
        List<Enemy> enemies;

        @BeforeEach
        void setUp() {
            boss = new Enemy("Boss", 100, 400);
            viceBoss = new Enemy("Vice-Boss", 90, 325);
            knight = new Enemy("Knight", 50, 100);
            peasant = new Enemy("Peasant", 1, 0);
        }

        @Test
        @DisplayName("Test sorting enemies by level using ")
        void sortEnemiesByLevelUsingComparator() {

            enemies = new ArrayList<>(4);
            enemies.add(knight);
            enemies.add(boss);
            enemies.add(peasant);
            enemies.add(viceBoss);

            List<Enemy> expected = new ArrayList<>(4);
            expected.add(peasant);
            expected.add(knight);
            expected.add(viceBoss);
            expected.add(boss);

            //WHEN
            CollectionSandbox.sortingEnemy(enemies, CollectionSandbox.ENEMY_SORTING.LEVEL);

            //THEN
            assertEquals(expected, enemies);
        }

        @Test
        @DisplayName("Test sorting enemies by reward using default method compareTo and Comparable interface")
        void sortingEnemiesByRewardUsingComparable() {

            enemies = new ArrayList<>(4);
            enemies.add(knight);
            enemies.add(boss);
            enemies.add(peasant);
            enemies.add(viceBoss);

            List<Enemy> expected = new ArrayList<>(4);
            expected.add(peasant);
            expected.add(knight);
            expected.add(viceBoss);
            expected.add(boss);

            //WHEN
            CollectionSandbox.sortingEnemy(enemies, CollectionSandbox.ENEMY_SORTING.REWARD);

            //THEN
            assertEquals(expected, enemies);
        }
    }
}