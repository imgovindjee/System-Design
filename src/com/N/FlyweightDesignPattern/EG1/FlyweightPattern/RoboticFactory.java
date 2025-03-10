package com.N.FlyweightDesignPattern.EG1.FlyweightPattern;

import com.N.FlyweightDesignPattern.EG1.FlyweightPattern.Robot.HumanoidRobot;
import com.N.FlyweightDesignPattern.EG1.FlyweightPattern.Robot.IRobot;
import com.N.FlyweightDesignPattern.EG1.FlyweightPattern.Robot.RoboticDogs;
import com.N.FlyweightDesignPattern.EG1.FlyweightPattern.Robot.Sprites;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private static Map<String, IRobot> roboticObject_cache = new HashMap<>();

    public static Map<String, IRobot> getRoboticObject_cache() {
        return roboticObject_cache;
    }

    public static IRobot createRobot(String robotType) {
        if(roboticObject_cache.containsKey(robotType)) {
            return roboticObject_cache.get(robotType);
        } else {
            if(robotType.equals("HUMANOID")) {
                IRobot humanoidRobotObj = new HumanoidRobot(robotType, new Sprites());
                roboticObject_cache.put(robotType, humanoidRobotObj); // adding it to the cache for later use and escaping it form object recreation
                return humanoidRobotObj;
            } else if(robotType.equals("ROBOTIC_DOGS")) {
                IRobot roboticDogObj = new RoboticDogs(robotType, new Sprites());
                roboticObject_cache.put(robotType, roboticDogObj); // adding it to the cache for later use and escaping it form object recreation
                return roboticDogObj;
            }
        }
        return null;
    }
}
