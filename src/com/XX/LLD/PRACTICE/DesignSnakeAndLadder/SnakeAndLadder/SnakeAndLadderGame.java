package com.XX.LLD.PRACTICE.DesignSnakeAndLadder.SnakeAndLadder;

import com.XX.LLD.PRACTICE.DesignSnakeAndLadder.Board;
import com.XX.LLD.PRACTICE.DesignSnakeAndLadder.Dice;
import com.XX.LLD.PRACTICE.DesignSnakeAndLadder.Player;

import java.util.ArrayList;
import java.util.List;

public class SnakeAndLadderGame {

    private Board board;
    private List<Player> players;
    private Dice dice;
    private int currentPlayerIndex;
    private int movesCount;

    public SnakeAndLadderGame(List<String> playerNames) {
        this.board = new Board();
        this.dice = new Dice();
        this.players = new ArrayList<>();
        this.currentPlayerIndex = 0;
        this.movesCount = 0;

        for (String pn:playerNames){
            this.players.add(new Player(pn));
        }
    }

    public void play() {
        while (!isGameOver()) {
            Player currentPlayer = players.get(currentPlayerIndex);
            int diceRoll = dice.roll();
            int newPos = currentPlayer.getCurrentPosition() + diceRoll;

            if (movesCount % players.size() == 0){
                if (movesCount == 0){
                    System.out.println("--------------------------START GAME---------------------------------");
                } else {
                    System.out.println("---------------------------------------------------------------------");
                }
                System.out.println("MOVE-" +(movesCount / 3 + 1));
            }

            if (newPos <= board.getBOARD_SIZE()) {
                currentPlayer.setCurrentPosition(board.getNewPositionAfterSnakeOrLadder(newPos));
                System.out.println(currentPlayer.getPlayerName() + " -> rolled a " + diceRoll + " and moved to position " + currentPlayer.getCurrentPosition());
            }
            if (currentPlayer.getCurrentPosition() == board.getBOARD_SIZE()) {
                System.out.println(currentPlayer.getPlayerName() + " wins");
                break;
            }
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
            movesCount++;
        }
    }

    private boolean isGameOver() {
        for (Player player:players){
            if (player.getCurrentPosition() == board.getBOARD_SIZE()) {
                return true;
            }
        }
        return false;
    }
}
