package com.AAA.StrategyDesignPattern.EG1;

import com.AAA.StrategyDesignPattern.EG1.Vehicles.GoodVehicle;
import com.AAA.StrategyDesignPattern.EG1.Vehicles.Vehicle;
import com.AAA.StrategyDesignPattern.EG1.Vehicles.sportsVehicle;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle1 = new GoodVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new sportsVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new sportsVehicle();
        vehicle3.drive();
    }
}
