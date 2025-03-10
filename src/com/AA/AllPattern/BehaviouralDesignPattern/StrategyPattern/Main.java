package com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern;

import com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Vehicles.GoodVehicle;
import com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Vehicles.OffRoadVehicle;
import com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Vehicles.SportsVehicle;
import com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new GoodVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new SportsVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new OffRoadVehicle();
        vehicle3.drive();
    }
}
