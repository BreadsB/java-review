package org.breadsb.sandbox.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnemyTestSuite {

    @Test
    @DisplayName("Test sorting enemies by level using ")
    void sortEnemiesByLevelUsingComparator() {
        //GIVEN
        Enemy boss = new Enemy("Boss", 100, 400);
        Enemy viceBoss = new Enemy("Vice-Boss", 90, 325);
        Enemy knight = new Enemy("Knight", 50, 100);
        Enemy peasant = new Enemy("Peasant", 1, 0);

        List<Enemy> enemies = new ArrayList<>(4);
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

        //GIVEN
        Enemy boss = new Enemy("Boss", 100, 400);
        Enemy viceBoss = new Enemy("Vice-Boss", 90, 325);
        Enemy knight = new Enemy("Knight", 50, 100);
        Enemy peasant = new Enemy("Peasant", 1, 0);

        List<Enemy> enemies = new ArrayList<>(4);
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
