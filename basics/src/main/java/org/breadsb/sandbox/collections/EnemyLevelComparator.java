package org.breadsb.sandbox.collections;

import java.util.Comparator;

public class EnemyLevelComparator implements Comparator<Enemy> {

    @Override
    public int compare(Enemy e1, Enemy e2) {
        return Integer.compare(e1.getLevel(), e2.getLevel());
    }
}
