package com.XX.LLD.PRACTICE.DesignTicTacToe2;

public class Player {

    private String playerName;
    private char symbol_OX;

    public Player(String playerName, char symbol_OX) {
        this.playerName = playerName;
        this.symbol_OX = symbol_OX;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public char getSymbol_OX() {
        return symbol_OX;
    }
    public void setSymbol_OX(char symbol_OX) {
        this.symbol_OX = symbol_OX;
    }
}
