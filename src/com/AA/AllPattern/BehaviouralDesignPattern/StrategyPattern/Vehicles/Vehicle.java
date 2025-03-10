package com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Vehicles;

import com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
