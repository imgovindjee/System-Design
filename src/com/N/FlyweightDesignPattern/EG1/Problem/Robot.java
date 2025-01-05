package com.N.FlyweightDesignPattern.EG1.Problem;

public class Robot {
    int coordinateX;
    int coordinateY;
    String type;
    Sprites body; // small 2D bitmap (GRAPHIC ELEMENT)

    public Robot(int coordinateX, int coordinateY, String type, Sprites body){
        this.body = body;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
    }

//   getter and setter
    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sprites getBody() {
        return body;
    }

    public void setBody(Sprites body) {
        this.body = body;
    }
}
