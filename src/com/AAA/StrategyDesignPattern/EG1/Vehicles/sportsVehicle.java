package com.AAA.StrategyDesignPattern.EG1.Vehicles;

import com.AAA.StrategyDesignPattern.EG1.Strategy.sportsDriveStrategy;

public class sportsVehicle extends Vehicle {

    public sportsVehicle() {
        super(new sportsDriveStrategy());
    }
}
