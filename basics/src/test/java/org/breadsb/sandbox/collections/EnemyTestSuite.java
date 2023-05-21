package org.breadsb.sandbox.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnemyTestSuite {

    Enemy boss, viceBoss, knight, peasant;
    List<Enemy> enemies;

    @BeforeEach
    void setUp() {
        boss = new Enemy("Boss", 100, 400);
        viceBoss = new Enemy("Vice-Boss", 90, 325);
        knight = new Enemy("Knight", 50, 100);
        peasant = new Enemy("Peasant", 1, 0);

        enemies = new ArrayList<>(4);
        enemies.add(knight);
        enemies.add(boss);
        enemies.add(peasant);
        enemies.add(viceBoss);
    }

    @Test
    @DisplayName("Test sorting enemies by level using ")
    void sortEnemiesByLevelUsingComparator() {

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
