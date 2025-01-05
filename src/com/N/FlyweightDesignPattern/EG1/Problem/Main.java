package com.N.FlyweightDesignPattern.EG1.Problem;

public class Main {
    public static void main(String[] args) {
        int x=0, y=0;
        for(int i=0; i<500000; i++) {
            Sprites humanoidSprites = new Sprites();
            Robot humanoidRobotObject = new Robot(x+i, y+i, "HUMANOID", humanoidSprites);
        }

        for(int i=0; i<500000; i++) {
            Sprites roboticDogSprites = new Sprites();
            Robot roboticDogObject = new Robot(x+i, y+i, "ROBOTIC_DOG", roboticDogSprites);
        }
    }
}
