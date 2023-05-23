package org.breadsb.sandbox.collections;

import java.util.Objects;

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

    public void addRank(double rankValue) {
        if (rankValue>0.0) {
            this.rank += rankValue;
        } else {
//            Throw custom exception
        }
    }

    @Override
    public int compareTo(User otherUser) {
        return Double.compare(getRank(), otherUser.getRank());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.age, age) == 0 && Double.compare(user.rank, rank) == 0 && Objects.equals(firstName, user.firstName) && Objects.equals(secondName, user.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, age, rank);
    }
}
