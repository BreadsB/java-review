package org.breadsb.sandbox.collections;

public class User implements Comparable<User> {
    private String firstName;
    private String secondName;
    private double age;
    private double rank;

    public User(String firstName, String secondName, double age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.rank = 0.0;
    }

    public User(String firstName, String secondName, double age, double rank) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.rank = rank;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public double getAge() {
        return this.age;
    }

    public double getRank() {
        return this.rank;
    }

    @Override
    public int compareTo(User otherUser) {
        return Double.compare(getRank(), otherUser.getRank());
    }
}
