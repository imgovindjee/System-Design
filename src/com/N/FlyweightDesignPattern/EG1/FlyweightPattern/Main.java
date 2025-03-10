package com.N.FlyweightDesignPattern.EG1.FlyweightPattern;

import com.N.FlyweightDesignPattern.EG1.FlyweightPattern.Robot.IRobot;

public class Main {
    public static void main(String[] args) {
        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(2, 2);

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(1, 0);

        IRobot roboticDog1 = RoboticFactory.createRobot("ROBOTIC_DOGS");
        roboticDog1.display(0,0);

        IRobot roboticDog2 = RoboticFactory.createRobot("ROBOTIC_DOGS");
        roboticDog2.display(4, 4);

        IRobot iRobot = RoboticFactory.createRobot("ROBOTIC_DOG");
        iRobot.display(4, 4);
    }
}
