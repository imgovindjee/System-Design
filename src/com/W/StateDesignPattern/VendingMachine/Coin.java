package com.W.StateDesignPattern.VendingMachine;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

//    CONSTRUCTOR-TYPE
    public  int value;
    Coin(int value){
        this.value = value;
    }
}
