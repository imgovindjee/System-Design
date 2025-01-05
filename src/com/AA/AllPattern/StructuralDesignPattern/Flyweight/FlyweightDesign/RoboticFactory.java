package com.AA.AllPattern.StructuralDesignPattern.Flyweight.FlyweightDesign;

import com.AA.AllPattern.StructuralDesignPattern.Flyweight.FlyweightDesign.Robot.HumanoidRobot;
import com.AA.AllPattern.StructuralDesignPattern.Flyweight.FlyweightDesign.Robot.IRobot;
import com.AA.AllPattern.StructuralDesignPattern.Flyweight.FlyweightDesign.Robot.RoboticDogs;
import com.AA.AllPattern.StructuralDesignPattern.Flyweight.FlyweightDesign.Robot.Sprites;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    public static Map<String, IRobot> roboticObject_cache = new HashMap<>();

    public static IRobot createRobot(String robotType) {
        if(roboticObject_cache.containsKey(robotType)) {
            System.out.println("-------------------------------------------------------------------------------" +
                    "\nALREADY CREATED ROBOT\n" +
                    "--------------------------------------------------------------------------------------");
            return roboticObject_cache.get(robotType);
        } else {
            System.out.println("-------------------------------------------------------------------------------" +
                    "\nNEWLY CREATED ROBOT\n" +
                    "--------------------------------------------------------------------------------------");
            if(robotType.equals("HUMANOID")) {
                Sprites sprites = new Sprites();
                IRobot humanoidRobot = new HumanoidRobot(robotType, sprites);
                roboticObject_cache.put(robotType, humanoidRobot);
                return humanoidRobot;
            } else if(robotType.equals("ROBOTIC_DOGS")) {
                Sprites sprites = new Sprites();
                IRobot roboticDog = new RoboticDogs(robotType, sprites);
                roboticObject_cache.put(robotType, roboticDog);
                return roboticDog;
            }
        }
        return null;
    }
}
