package com.AA.AllPattern.StructuralDesignPattern.Flyweight.Problem;

public class Main {
    public static void main(String[] args) {
        int x = 0, y=0;

        for(int i=0; i<500000; i++){
            Sprites sprites = new Sprites();
            Robot humanoid = new Robot(x+2*i, y+i, "Humanoid", sprites);
        }

        for(int i=0; i<500000; i++){
            Sprites sprites = new Sprites();
            Robot roboticDogs = new Robot(x+i, y+i, "ROBOTIC_DOGS", sprites);
        }
    }
}
