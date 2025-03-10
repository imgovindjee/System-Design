package com.AAA.StrategyDesignPattern.EG1.Vehicles;

import com.AAA.StrategyDesignPattern.EG1.Strategy.normalDriveStrategy;

public class GoodVehicle extends Vehicle {

    public GoodVehicle(){
        super(new normalDriveStrategy());
    }
}
