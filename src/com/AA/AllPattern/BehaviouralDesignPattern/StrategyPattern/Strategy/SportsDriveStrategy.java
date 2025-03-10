package com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive Capabilities");
    }
}
