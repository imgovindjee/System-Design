package com.N.FlyweightDesignPattern.EG1.FlyweightPattern.Robot;

public class RoboticDogs implements IRobot {
    private String type;
    private Sprites body; // small 2D Bitmap (Graphically Represented)

//    CONSTRUCTOR
    public RoboticDogs(String type, Sprites body){
        this.body = body;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int xCoordinate, int yCoordinate) {
        System.out.println("-----------------------------ROBOTIC DOGS----------------------------");
        System.out.println("XCoordinate: "+xCoordinate +
                "\nyCoordinate: "+yCoordinate);

//        BUSINESS LOGIC
    }
}
