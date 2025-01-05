package com.AAA.StrategyDesignPattern.EG1.Strategy;

public class normalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Capabilities");
    }
}
