package com.XX.LLD.PRACTICE.DesignSnakeAndLadder;

public class Player {

    private String playerName;
    private int currentPosition;

    public Player(String playerName) {
        this.playerName = playerName;
        this.currentPosition = 0;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getCurrentPosition() {
        return currentPosition;
    }
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
