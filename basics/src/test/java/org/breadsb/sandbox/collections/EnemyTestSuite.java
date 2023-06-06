package org.breadsb.sandbox.collections;

import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnemyTestSuite {

    @Nested
    class innerSortEnemiesSet {
        Enemy enemy1, enemy2, enemy3;

        @BeforeEach
        void setUp() {
            enemy1 = new Enemy("Standard", 17, 500.0);
            enemy2 = new Enemy("High", 20, 414.0);
            enemy3 = new Enemy("Highest", 30, 714.0);
        }

        @Test
        void sortEnemySetByLevel() {
            EnemyLevelComparator elc = new EnemyLevelComparator();

            Set<Enemy> enemySet = new TreeSet<>(elc);
            enemySet.add(enemy3);
            enemySet.add(enemy1);
            enemySet.add(enemy2);

            Set<Enemy> expected = new TreeSet<>();
            expected.add(enemy2);
            expected.add(enemy1);
            expected.add(enemy3);

            Assertions.assertNotEquals(expected.stream().toList(), enemySet.stream().toList());
        }

        @Test
        void sortEnemySetByReward() {
            Set<Enemy> enemySet = new TreeSet<>();
            enemySet.add(enemy3);
            enemySet.add(enemy1);
            enemySet.add(enemy2);

            Set<Enemy> expected = new TreeSet<>();
            expected.add(enemy2);
            expected.add(enemy1);
            expected.add(enemy3);

            Assertions.assertEquals(expected.stream().toList(), enemySet.stream().toList());
        }
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

        @Test
        void sortEnemiesSet() {

            Set<Enemy> enemySet = new HashSet<>();
            enemySet.add(boss);
            enemySet.add(peasant);
            enemySet.add(knight);
            enemySet.add(viceBoss);

            List<Enemy> enemyList = new ArrayList<>(enemySet);
            Collections.sort(enemyList);

            Set<Enemy> sortedEnemySet = new HashSet<>();
//            Set<Enemy> sortedEnemySet = new HashSet<>(enemyList);
            sortedEnemySet = enemyList.stream().collect(Collectors.toSet());

            Assertions.assertEquals(enemySet, sortedEnemySet);
        }
    }
}