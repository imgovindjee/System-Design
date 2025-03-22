package com.XX.LLD.PRACTICE.DesignSnakeAndLadder.SnakeAndLadder;

import java.util.Arrays;
import java.util.List;

public class SnakeAndLadder {

    public static void run() {
        GameManager gameManager = GameManager.getInstance();

//        GAME-1
//        PLAYER List
        List<String> playerList1 = Arrays.asList("Player 1", "Player 2", "Player 3");
        gameManager.startNewGame(playerList1);

//        GAME-2
//        PLAYER LIST
//        List<String> playerList2 = Arrays.asList("Player 4", "Player 5");
//        gameManager.startNewGame(playerList2);
    }
}
