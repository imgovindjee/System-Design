package com.XX.LLD.PRACTICE.DesignSnakeAndLadder;

public class Dice {

    private final int MIN_VALUE = 1;
    private final int MAX_VALUE = 6;

    public int roll() {
        return (int) (Math.random() * (MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE);
    }
}
