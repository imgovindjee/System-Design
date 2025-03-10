package com.XX.LLD.PRACTICE.DesignSnakeAndLadder.SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private static GameManager gameManager;
    private final List<SnakeAndLadderGame> snakeAndLadderList;

    private GameManager() {
        this.snakeAndLadderList = new ArrayList<>();
    }

    public static synchronized GameManager getInstance() {
        if (gameManager == null) {
            gameManager = new GameManager();
        }
        return gameManager;
    }

    public void startNewGame(List<String> playerNameList) {
        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderGame(playerNameList);
        snakeAndLadderList.add(snakeAndLadderGame);

//        TREAD CREATION FOR PLAY FOR PLAYING A GAME
        new Thread(snakeAndLadderGame::play)
                .start();
    }
}
