package com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Vehicles;

import com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
