package com.XX.LLD.PRACTICE.DesignTrafficSignalSystem.Controller;

import com.XX.LLD.PRACTICE.DesignTrafficSignalSystem.Road;
import com.XX.LLD.PRACTICE.DesignTrafficSignalSystem.Signal;
import com.XX.LLD.PRACTICE.DesignTrafficSignalSystem.TrafficLight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TrafficController {

    private static TrafficController trafficController;
    private Map<String, Road> roadMap;

    private TrafficController(){
        this.roadMap = new ConcurrentHashMap<>();
    }

    public static synchronized TrafficController getInstance(){
        if(trafficController == null){
            trafficController = new TrafficController();
        }
        return trafficController;
    }

    public void addRoad(Road road){
        roadMap.put(road.getRoadID(), road);
    }

    public void removeRoad(String roadID){
        roadMap.remove(roadID);
    }

    public synchronized void startTrafficControl(){
        for (Road road:roadMap.values()){
            TrafficLight trafficLight = road.getTrafficLight();
            new Thread(()->{
                while (true){
                    try {
                        Thread.sleep(trafficLight.getRedDuration());
                        trafficLight.changeSignal(Signal.GREEN);

                        Thread.sleep(trafficLight.getGreenDuration());
                        trafficLight.changeSignal(Signal.YELLOW);

                        Thread.sleep(trafficLight.getYellowDuration());
                        trafficLight.changeSignal(Signal.RED);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public void handleEmergency(String roadID){
        Road road = roadMap.get(roadID);
        if(road != null){
            TrafficLight trafficLight = road.getTrafficLight();
            trafficLight.changeSignal(Signal.GREEN);

//            PERFORM EMERGENCY LOGIC
        }
    }
}
