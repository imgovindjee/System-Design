package com.A.SOLID.I.InterfaceSegmentedPrinciple.Solution;

public class Waiter implements WaiterInterface{
    @Override
    public void serveCustomer() {
        System.out.println("Served to customer");
    }

    @Override
    public void takeOrder() {
        System.out.println("Order taken from customer");
    }
}
