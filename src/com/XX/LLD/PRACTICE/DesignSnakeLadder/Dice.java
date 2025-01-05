package com.XX.LLD.PRACTICE.DesignSnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int diceCOunt;
    int min = 1;
    int max = 6;

    public Dice(int diceCOunt){
        this.diceCOunt = diceCOunt;
    }

    public int rollDice(){
        int totalSum = 0;
        int diceUsed = 0;
        while (diceUsed < diceCOunt){
            totalSum += ThreadLocalRandom.current().nextInt(min, max+1);
            diceUsed++;
        }
        return totalSum;
    }
}
