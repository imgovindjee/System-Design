package com.AA.AllPattern.CreationalDesignPattern.AbstractFactory;

import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.AbstractFactory.AbstractFactory;
import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.AbstractFactory.EconomicCarFactory;
import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.AbstractFactory.LuxaryCarFactory;

public class AbstractFactoryProduct {
    public AbstractFactory getFactoryInstance(String value) {
        if(value.equals("ECONOMIC")) {
            return new EconomicCarFactory();
        } else if(value.equals("LUXURY")){
            return new LuxaryCarFactory();
        } else {
            return null;
        }
    }
}
