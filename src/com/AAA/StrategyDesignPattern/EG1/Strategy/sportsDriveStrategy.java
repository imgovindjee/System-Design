package com.AAA.StrategyDesignPattern.EG1.Strategy;

public class sportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive Capabilities");
    }
}
