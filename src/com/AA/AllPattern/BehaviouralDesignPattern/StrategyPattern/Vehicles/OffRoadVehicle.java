package com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Vehicles;

import com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
