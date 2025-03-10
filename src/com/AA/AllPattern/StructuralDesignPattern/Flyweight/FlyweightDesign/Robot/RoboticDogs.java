package com.AA.AllPattern.StructuralDesignPattern.Flyweight.FlyweightDesign.Robot;

public class RoboticDogs implements IRobot {
    String type;
    Sprites body;

    public RoboticDogs(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int xCoordinate, int yCoordinate) {
        System.out.println("xCoordinate: "+xCoordinate+
                "\nyCoordinate: "+yCoordinate);
    }
}
