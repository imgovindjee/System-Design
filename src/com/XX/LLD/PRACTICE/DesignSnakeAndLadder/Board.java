package com.XX.LLD.PRACTICE.DesignSnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final int BOARD_SIZE = 100;
    private final List<Snake> snakeList;
    private final List<Ladder> ladderList;

    public Board() {
        this.snakeList = new ArrayList<>();
        this.ladderList = new ArrayList<>();
        initializeSnakesAndLadder();
    }

    private void initializeSnakesAndLadder() {
//        SPREAD THE SNAKES ON THE BOARD
        snakeList.add(new Snake(16, 6));
        snakeList.add(new Snake(46, 26));
        snakeList.add(new Snake(64, 60));
        snakeList.add(new Snake(93, 73));

//        SPREAD LADDER ON THE BOARD
        ladderList.add(new Ladder(1, 38));
        ladderList.add(new Ladder(4, 14));
        ladderList.add(new Ladder(9, 31));
        ladderList.add(new Ladder(21, 42));
        ladderList.add(new Ladder(28, 84));
        ladderList.add(new Ladder(51, 67));
        ladderList.add(new Ladder(80, 99));
    }

    public int getNewPositionAfterSnakeOrLadder(int pos) {
        for (Snake sl:snakeList) {
            if (sl.getStart() == pos) {
                return sl.getEnd();
            }
        }
        for (Ladder ll:ladderList){
            if (ll.getStart() == pos){
                return ll.getEnd();
            }
        }
        return pos;
    }

    public int getBOARD_SIZE() {
        return BOARD_SIZE;
    }
}
