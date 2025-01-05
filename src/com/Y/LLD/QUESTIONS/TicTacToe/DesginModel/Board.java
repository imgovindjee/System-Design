package com.Y.LLD.QUESTIONS.TicTacToe.DesginModel;

import java.util.ArrayList;
import java.util.List;
import com.sun.tools.javac.util.Pair;

public class Board {
    public int size;
    public PlayingPiece[][] playingPieces_board;

    public Board(int size){
        this.size = size;
        playingPieces_board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece){
        if(playingPieces_board[row][column] != null) {
            return false;
        } else {
            playingPieces_board[row][column] = playingPiece;
            return true;
        }
    }

    public List<Pair<Integer, Integer>> getFreeCell() {
        List<Pair<Integer, Integer>> freeCell_list = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(playingPieces_board[i][j] == null){
                    Pair<Integer, Integer> pair = new Pair<>(i, j);
                    freeCell_list.add(pair);
                }
            }
        }
        return freeCell_list;
    }

    public void printBoard(){
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(playingPieces_board[i][j] != null){
                    System.out.print(playingPieces_board[i][j].pieceType.name()+" ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
