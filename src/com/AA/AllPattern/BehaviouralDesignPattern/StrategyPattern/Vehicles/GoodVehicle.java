package com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Vehicles;

import com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle{

    public GoodVehicle() {
        super(new NormalDriveStrategy());
    }
}
