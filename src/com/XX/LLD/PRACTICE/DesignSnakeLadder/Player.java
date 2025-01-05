package com.XX.LLD.PRACTICE.DesignSnakeLadder;

public class Player {

    String playerID;
    int currentPosition;

    public Player(String playerID, int currentPosition) {
        this.playerID = playerID;
        this.currentPosition = currentPosition;
    }

//    GETTER AND SETTER
    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
