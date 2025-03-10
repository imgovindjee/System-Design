package com.XX.LLD.PRACTICE.DesignSnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;

//    CONSTRUCTOR INJECTION
    public Board(int boardSize, int noOfSnakes, int noOfLadders){
        initializeCells(boardSize);
        addSnakesAndLadders(cells, noOfLadders, noOfSnakes);
    }

    private void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                Cell cell_obj = new Cell();
                cells[i][j] = cell_obj;
            }
        }
    }

    private void addSnakesAndLadders(Cell[][] cells, int noOfLadders, int noOfSnakes){
        while (noOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(snakeHead >= snakeTail){
                continue;
            }

            Jump snake_obj = new Jump();
            snake_obj.start = snakeHead;
            snake_obj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snake_obj;
            noOfSnakes--;
        }

        while (noOfLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(ladderStart >= ladderEnd){
                continue;
            }

            Jump ladder_obj = new Jump();
            ladder_obj.start = ladderStart;
            ladder_obj.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladder_obj;
            noOfLadders--;
        }
    }

    public Cell getCell(int playerPosition){
        return cells[playerPosition/cells.length][playerPosition%cells.length];
    }
}
