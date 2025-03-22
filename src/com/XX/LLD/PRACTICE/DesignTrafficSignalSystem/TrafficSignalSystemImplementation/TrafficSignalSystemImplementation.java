package com.XX.LLD.PRACTICE.DesignTrafficSignalSystem.TrafficSignalSystemImplementation;

import com.XX.LLD.PRACTICE.DesignTrafficSignalSystem.Controller.TrafficController;
import com.XX.LLD.PRACTICE.DesignTrafficSignalSystem.Road;
import com.XX.LLD.PRACTICE.DesignTrafficSignalSystem.TrafficLight;

public class TrafficSignalSystemImplementation {
    public static void run(){
//        instance of traffic controller
        TrafficController trafficController = TrafficController.getInstance();

//        Create Roads
        Road road1 = new Road("R1", "Main Street");
        Road road2 = new Road("R2", "Kanal Road");
        Road road3 = new Road("R3", "Park Avenue");
        Road road4 = new Road("R4", "Elm Street");
        Road road5 = new Road("R5", "London OverWay");

//        Create traffic lights
        TrafficLight trafficLight1 = new TrafficLight("tl1", 6000, 3000, 9000, road1);
        TrafficLight trafficLight2 = new TrafficLight("tl2", 6000, 3000, 9000, road2);
        TrafficLight trafficLight3 = new TrafficLight("tl3", 6000, 3000, 9000, road3);
        TrafficLight trafficLight4 = new TrafficLight("tl4", 6000, 3000, 9000, road4);
        TrafficLight trafficLight5 = new TrafficLight("tl5", 6000, 3000, 9000, road5);

//        assign traffic lights to each road
        road1.setTrafficLight(trafficLight1);
        road2.setTrafficLight(trafficLight2);
        road3.setTrafficLight(trafficLight3);
        road4.setTrafficLight(trafficLight4);
        road5.setTrafficLight(trafficLight5);

//        add roads to trafficControllers
        trafficController.addRoad(road1);
        trafficController.addRoad(road2);
        trafficController.addRoad(road3);
        trafficController.addRoad(road4);
        trafficController.addRoad(road5);

//        Start TrafficController
        trafficController.startTrafficControl();

//        Emergency Control for specific road
        trafficController.handleEmergency("R2");
    }
}
