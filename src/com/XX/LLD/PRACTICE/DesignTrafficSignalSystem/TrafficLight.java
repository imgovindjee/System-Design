package com.XX.LLD.PRACTICE.DesignTrafficSignalSystem;

public class TrafficLight {

    private final String trafficLightID;
    private Signal currentSignal;
    private int redDuration;
    private int yellowDuration;
    private int greenDuration;
    private Road road;

    public TrafficLight(String trafficLightID, int redDuration, int yellowDuration, int greenDuration, Road road) {
        this.trafficLightID = trafficLightID;
        this.currentSignal = Signal.RED;
        this.redDuration = redDuration;
        this.yellowDuration = yellowDuration;
        this.greenDuration = greenDuration;
        this.road = road;
    }

    public synchronized  void changeSignal(Signal newSignal){
        currentSignal = newSignal;
        notifyObservers();
    }

    public String getTrafficLightID() {
        return trafficLightID;
    }

    public Signal getCurrentSignal() {
        return currentSignal;
    }

    public int getRedDuration() {
        return redDuration;
    }

    public void setRedDuration(int redDuration) {
        this.redDuration = redDuration;
    }

    public int getYellowDuration() {
        return yellowDuration;
    }

    public void setYellowDuration(int yellowDuration) {
        this.yellowDuration = yellowDuration;
    }

    public int getGreenDuration() {
        return greenDuration;
    }

    public void setGreenDuration(int greenDuration) {
        this.greenDuration = greenDuration;
    }

    private void notifyObservers(){
        System.out.println(road.getRoadName()+", Signal Changed to "+currentSignal);
    }
}
