package com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.Factory.Economic;

import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.Factory.Car;

public class EconomicCar1 implements Car {
    @Override
    public int getTopSpeed() {
        return 100;
    }
}
