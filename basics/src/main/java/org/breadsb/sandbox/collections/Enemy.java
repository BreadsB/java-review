package org.breadsb.sandbox.collections;

public class Enemy implements Comparable<Enemy> {

    private String name;
    private int level;
    private double reward;

    public Enemy(String name, int level, double reward) {
        this.name = name;
        this.level = level;
        this.reward = reward;
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public double getReward() {
        return this.reward;
    }

    @Override
    public int compareTo(Enemy o) {
        return Double.compare(this.getReward(), o.getReward());
    }
}
