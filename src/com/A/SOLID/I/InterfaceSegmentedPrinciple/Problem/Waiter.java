package com.A.SOLID.I.InterfaceSegmentedPrinciple.Problem;

public class Waiter implements ResturantEmployee {
    @Override
    public void washesDish() {
//        not my work
//        why to implement
    }

    @Override
    public void serveCustomer() {
//        my work, I will do
        System.out.println("Serving to customer");
    }

    @Override
    public void cookFood() {
//        not my work
//        why to implement
    }
}
