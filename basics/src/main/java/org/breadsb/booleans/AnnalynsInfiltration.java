package org.breadsb.booleans;

//https://exercism.org/tracks/java/exercises/annalyns-infiltration


public class AnnalynsInfiltration {

    interface Person {
        boolean isAwake = false;

    }

    private static class Knight implements Person {
        static boolean isAwake = false;
    }

    private static class Archer implements Person {
        static boolean isAwake = true;
    }

    private static class Prisoner implements Person {
        static boolean isAwake = false;
    }

    private static class Dog {
        static boolean isPresent = false;
    }

    public AnnalynsInfiltration(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean dogIsPresent) {
        Knight.isAwake = knightIsAwake;
        Archer.isAwake = archerIsAwake;
        Prisoner.isAwake = prisonerIsAwake;
        Dog.isPresent = dogIsPresent;
    }

    public boolean fastAttack() {
        return !Knight.isAwake;
    }

    public boolean spyGroup() {
        return Knight.isAwake || Archer.isAwake;
    }

    public boolean signalPrisoner() {
        return !Archer.isAwake && Prisoner.isAwake;
    }

    public boolean freePrisoner() {
        return Dog.isPresent && !Archer.isAwake || Prisoner.isAwake && !Knight.isAwake && !Archer.isAwake;
    }
}
