package org.breadsb.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RobotFactoryTestSuite {

    private final RobotFactory robotFactory = new RobotFactory();

    @Test
    void testGenerateNewRobot() {
        //GIVEN & WHEM
        Robot robot = robotFactory.createRobot();

        //THEN
        Assertions.assertNotNull(robot);
        Assertions.assertNull(robot.getName());
    }

    @Test
    void testRobotFirstRun() {
        //GIVEN
        Robot robot = robotFactory.createRobot();

        //WHEN
        robotFactory.runRobot(robot);
        String name = robot.getName();

        //THEN
        Assertions.assertEquals(5, name.length());
        System.out.println(name);
    }

    @Test
    void testResetRobot() {
        //GIVEN
        Robot robot = robotFactory.createRobot();
        String robotNameAfterFirstRun;
        String robotNameAfterReset;

        //WHEN
        robotFactory.runRobot(robot);
        robotNameAfterFirstRun = robot.getName();
        robotFactory.resetRobot(robot);
        robotNameAfterReset = robot.getName();

        //THEN
        Assertions.assertNotEquals(robotNameAfterFirstRun, robotNameAfterReset);
        System.out.println("Robot after first run name: " + robotNameAfterFirstRun
                + "; Robot after reset name: " + robotNameAfterReset);
    }
}