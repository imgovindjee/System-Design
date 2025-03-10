package com.AA.AllPattern.BehaviouralDesignPattern.CommandPattern.Problem;


public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOnAC();
        airConditioner.setTemperature(20);
        airConditioner.turnOffAC();
    }
}
