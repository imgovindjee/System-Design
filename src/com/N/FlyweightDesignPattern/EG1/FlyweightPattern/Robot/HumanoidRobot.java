package com.N.FlyweightDesignPattern.EG1.FlyweightPattern.Robot;

public class HumanoidRobot implements IRobot {
    private String type;
    private Sprites body; // small 2D Bitmap (Graphically Represented)

    //    CONSTRUCTOR
    public HumanoidRobot(String type, Sprites body) {
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
        System.out.println("-----------------------------Humanoid DOGS----------------------------");
        System.out.println("XCoordinate: "+xCoordinate +
                "\nyCoordinate: "+yCoordinate);

//        BUSINESS LOGIC

    }
}
