package com.AA.AllPattern.StructuralDesignPattern.Flyweight.Problem;

public class Robot {
    int xCoordinates;
    int yCoordinates;
    String type;
    Sprites body; // 2D BITMAP

//    CONSTRUCTOR
    public Robot(int xCoordinates, int yCoordinates, String type, Sprites body) {
        this.body = body;
        this.type = type;
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }
}
