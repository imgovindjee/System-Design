package com.XX.LLD.PRACTICE.DesignTicTacToe2;

public class Board {

    private final char[][] grid;
    private int movesCount;

    public Board() {
        this.grid = new char[3][3];
        initializeBoardGrid();
    }

    private void initializeBoardGrid() {
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                grid[row][col] = '-';
            }
        }
        movesCount = 0;
    }

    public synchronized void makeMove(int row, int column, char symbol){
        if (row < 0 || row >= 3 || column < 0 || column >= 3 || grid[row][column] != '-'){
            throw new IllegalArgumentException("INVALID MOVE!!");
        }

        grid[row][column] = symbol;
        movesCount++;
    }

    public boolean isFull(){
        return movesCount == 9;
    }

    public boolean hasWinner() {
//        CHECK ROW
        for (int row = 0; row < 3; row++) {
            if (grid[row][0] != '-' && grid[row][0] == grid[row][1] && grid[row][1] == grid[row][2]) {
                return true;
            }
        }

//        CHECK COLUMN
        for (int col = 0; col < 3; col++) {
            if (grid[0][col] != '-' && grid[0][col] == grid[1][col] && grid[1][col] == grid[2][col]) {
                return true;
            }
        }

//        CHECK DIAGONAL
        return (grid[0][0] != '-' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2])  ||
                (grid[0][2] != '-' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]);
    }

    public void printBoard() {
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(grid[row][col] + "         ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
