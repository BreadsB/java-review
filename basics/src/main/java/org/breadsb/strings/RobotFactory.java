package org.breadsb.strings;

// https://exercism.org/tracks/java/exercises/robot-name


import java.util.HashSet;
import java.util.Set;

public class RobotFactory implements RandomThings {
    private final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final Set<String> usedRobotNames = new HashSet<>();

    public String generateName() {
        return (randomString('A', 'Z', 2) + randomString('0', '9', 3)).toUpperCase();
    }

    public Robot createRobot(){
        return new Robot();
    }

    public void runRobot(Robot robot) {
        robot.setName(generateName());
        usedRobotNames.add(robot.getName());
    }

    public void resetRobot(Robot robot) {
        usedRobotNames.remove(robot.getName());
        String name;
        while (usedRobotNames.contains(name = generateName())) {
        }
        robot.setName(name);
    }
}
