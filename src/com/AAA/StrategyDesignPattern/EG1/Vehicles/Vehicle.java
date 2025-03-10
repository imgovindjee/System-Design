package com.AAA.StrategyDesignPattern.EG1.Vehicles;

import com.AAA.StrategyDesignPattern.EG1.Strategy.DriveStrategy;


public class Vehicle {
    DriveStrategy driveStrategy;

//    Construction Injections
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
