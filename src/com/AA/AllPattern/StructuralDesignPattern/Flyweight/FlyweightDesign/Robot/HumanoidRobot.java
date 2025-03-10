package com.AA.AllPattern.StructuralDesignPattern.Flyweight.FlyweightDesign.Robot;

public class HumanoidRobot implements IRobot{
    String type;
    Sprites body; // small 2D bitMap

    public HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int xCoordinate, int yCoordinate) {
        System.out.println("xCoordinate: "+xCoordinate+
                "\nyCoordinate: "+yCoordinate);
    }
}
