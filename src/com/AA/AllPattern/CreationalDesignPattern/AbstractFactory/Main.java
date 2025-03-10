package com.AA.AllPattern.CreationalDesignPattern.AbstractFactory;

import com.AA.AllPattern.CreationalDesignPattern.AbstractFactory.AbstractFactory.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProduct abstractFactoryProduct = new AbstractFactoryProduct();

//        ECONOMIC
        AbstractFactory abstractFactory = abstractFactoryProduct.getFactoryInstance("ECONOMIC");
        System.out.println("Economic: "+abstractFactory.getInstance(100000).getTopSpeed());
        System.out.println("Economic: "+abstractFactory.getInstance(350000).getTopSpeed());

//        LUXURY
        AbstractFactory abstractFactory1 = abstractFactoryProduct.getFactoryInstance("LUXURY");
        System.out.println("Luxury: "+abstractFactory1.getInstance(1050000).getTopSpeed());
        System.out.println("Luxury: "+abstractFactory1.getInstance(3550000).getTopSpeed());

//        PREMIUM
        AbstractFactory abstractFactory2 = abstractFactoryProduct.getFactoryInstance("PREMIUM");
        System.out.println("Premium: "+abstractFactory2.getInstance(192921).getTopSpeed());
    }
}
