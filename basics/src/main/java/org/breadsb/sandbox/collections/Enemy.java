package org.breadsb.sandbox.collections;

import java.util.Comparator;

public class Enemy {

    private String name;
    private int level;

    public Enemy(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }
}
