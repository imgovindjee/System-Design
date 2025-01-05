package com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.AbstractFactory;

import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.Factory.Car;
import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.Factory.Economic.EconomicCar1;
import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.Factory.Economic.EconomicCar2;

public class EconomicCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price < 300001){
            return new EconomicCar2();
        } else if(price > 300001){
            return new EconomicCar1();
        }
        return null;
    }
}
