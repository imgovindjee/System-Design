package com.AAA.StrategyDesignPattern.EG1.Vehicles;

import com.AAA.StrategyDesignPattern.EG1.Strategy.sportsDriveStrategy;

public class offRoadVehicle extends Vehicle {

    public offRoadVehicle() {
        super(new sportsDriveStrategy());
    }
}
