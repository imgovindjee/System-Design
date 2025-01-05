package com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.AbstractFactory;

import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.Factory.Car;
import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.Factory.Luxary.LuxaryCar1;
import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.Factory.Luxary.LuxaryCar2;

public class LuxaryCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price >= 1000000 && price <= 2000000) {
            return new LuxaryCar2();
        } else if(price > 2000001) {
            return new LuxaryCar1();
        }
        return null;
    }
}
