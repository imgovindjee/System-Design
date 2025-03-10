package com.XX.LLD.PRACTICE.DesignTrafficSignalSystem;

public class Road {

    private String roadID;
    private String roadName;
    private TrafficLight trafficLight;

    public Road(String roadID, String roadName){
        this.roadID = roadID;
        this.roadName = roadName;
    }

    public String getRoadID() {
        return roadID;
    }

    public void setRoadID(String roadID) {
        this.roadID = roadID;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public TrafficLight getTrafficLight() {
        return trafficLight;
    }

    public void setTrafficLight(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
}
