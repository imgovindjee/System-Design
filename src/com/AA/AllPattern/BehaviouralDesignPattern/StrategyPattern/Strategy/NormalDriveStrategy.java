package com.AA.AllPattern.BehaviouralDesignPattern.StrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Capabilities");
    }
}
