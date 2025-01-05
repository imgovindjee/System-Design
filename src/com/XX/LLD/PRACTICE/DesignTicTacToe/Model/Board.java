package com.XX.LLD.PRACTICE.DesignTicTacToe.Model;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece){
        if(board[row][column] != null){
            return false;
        }

        board[row][column] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++){
                if(board[i][j] == null){
                    Pair<Integer, Integer> row_column_pair = new Pair<>(i, j);
                    freeCells.add(row_column_pair);
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (board[i][j] != null){
                    System.out.println(board[i][j].getPieceType()+"  ");
                } else {
                    System.out.println("   ");
                }
                System.out.println(" | ");
            }
            System.out.println();
        }
    }
}
