package com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.AbstractFactory;

import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.Factory.Car;

public interface AbstractFactory {
    public Car getInstance(int price);
}
