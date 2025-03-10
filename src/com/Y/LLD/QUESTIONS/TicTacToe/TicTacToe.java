package com.Y.LLD.QUESTIONS.TicTacToe;


import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.Y.LLD.QUESTIONS.TicTacToe.DesginModel.*;
import com.sun.tools.javac.util.Pair;

public class TicTacToe {
    Deque<Player> deque_Players;
    Board gameBoard;

    public TicTacToe(){
        initilizeGame();
    }

    public void initilizeGame(){
        deque_Players = new LinkedList<>();

//        player-1
        PlayingWithX playingWithX = new PlayingWithX();
        Player player1 = new Player("Player1", playingWithX);

//        player-2
        PlayingWithO playingWithO = new PlayingWithO();
        Player player2 = new Player("Player2", playingWithO);

//        adding to the player_list
        deque_Players.add(player1);
        deque_Players.add(player2);

//        initialize the Board
        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = deque_Players.removeFirst();

            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpace_list = gameBoard.getFreeCell();
            if(freeSpace_list.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println("Player: " + playerTurn.name + " Enter row, Column: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] rowCol = str.split(",");
            int inpRow = Integer.parseInt(rowCol[0]);
            int inpCol = Integer.parseInt(rowCol[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inpRow, inpCol, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully) {
                System.out.println("Incorrect position chosen, try again");
                deque_Players.addFirst(playerTurn);
                continue;
            }
            deque_Players.addLast(playerTurn);
            boolean winner = isThereWinner(inpRow, inpCol, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.name;
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

//        row
        for(int i=0; i<gameBoard.size; i++) {
            if(gameBoard.playingPieces_board[row][i] == null || gameBoard.playingPieces_board[row][i].pieceType != pieceType){
                rowMatch = false;
            }
        }

//        column
        for(int i=0; i<gameBoard.size; i++) {
            if(gameBoard.playingPieces_board[i][column] == null || gameBoard.playingPieces_board[i][column].pieceType != pieceType){
                columnMatch = false;
            }
        }

//        diagonal
        for(int i=0, j=0; i<gameBoard.size; i++, j++) {
            if(gameBoard.playingPieces_board[i][j] == null || gameBoard.playingPieces_board[i][j].pieceType != pieceType){
                diagonalMatch = false;
            }
        }

//        antiDiagonalMatch
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size; i++, j--) {
            if(gameBoard.playingPieces_board[i][j] == null || gameBoard.playingPieces_board[i][j].pieceType != pieceType){
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}