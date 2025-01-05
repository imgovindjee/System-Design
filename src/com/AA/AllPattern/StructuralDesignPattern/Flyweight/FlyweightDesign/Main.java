package com.AA.AllPattern.StructuralDesignPattern.Flyweight.FlyweightDesign;

import com.AA.AllPattern.StructuralDesignPattern.Flyweight.FlyweightDesign.Robot.IRobot;

public class Main {
    public static void main(String[] args) {
        IRobot humanoidRobot = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot.display(2,2);

        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(2, 1);

        IRobot roboticDogs = RoboticFactory.createRobot("ROBOTIC_DOGS");
        roboticDogs.display(1, 2);

        IRobot roboticDogs1 = RoboticFactory.createRobot("ROBOTIC_DOGS");
        roboticDogs1.display(3, 2);
    }
}
