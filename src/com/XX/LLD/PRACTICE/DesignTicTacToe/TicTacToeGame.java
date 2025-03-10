package com.XX.LLD.PRACTICE.DesignTicTacToe;

import com.XX.LLD.PRACTICE.DesignTicTacToe.Enum.PieceType;
import com.XX.LLD.PRACTICE.DesignTicTacToe.Model.*;
import com.sun.tools.javac.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Board board;
    Deque<Player> players;

    public void initializeGame(){
//        CREATING 2-PLAYER's
        players = new LinkedList<>();

        PlayingPieceX cross = new PlayingPieceX();
        Player player1 = new Player("Player1", cross);

        PlayingPieceO nought = new PlayingPieceO();
        Player player2 = new Player("Player2", nought);

        players.add(player1);
        players.add(player2);

//        INITIALIZE BOARD
        board = new Board(3);
    }

    public String startGame(){
        boolean winner= false;
        while (winner){
            Player playerTurn = players.removeFirst();

            board.printBoard();
            List<Pair<Integer, Integer>> freeSpace = board.getFreeCells();
            if (freeSpace.isEmpty()){
                winner = false;
                continue;
            }

//            READ THE USER INPUT
            System.out.println("Player: "+playerTurn.getPlayerName()+" Enter row Column: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int inp_row = Integer.valueOf(values[0]);
            int inp_column = Integer.valueOf(values[1]);

//            PLACE THE PIECE
            boolean pieceAddedSuccessfully = board.addPiece(inp_row, inp_column, playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position chosen, please try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean win = isThereWinner(inp_row, inp_column, playerTurn.getPlayingPiece().getPieceType());
            if (win){
                return playerTurn.getPlayerName();
            }
;        }
        return "TIE";
    }

    private boolean isThereWinner(int row, int col, PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for (int i=0; i<board.getSize(); i++){
            if (board.getBoard()[row][i]==null || board.getBoard()[row][i].getPieceType() != pieceType){
                rowMatch = false;
            }
        }

        for (int i=0; i<board.getSize(); i++){
            if (board.getBoard()[i][col]==null || board.getBoard()[i][col].getPieceType() != pieceType){
                columnMatch = false;
            }
        }


        for (int i=0, j=0; i<board.getSize(); i++, j++){
            if (board.getBoard()[i][j]==null || board.getBoard()[i][j].getPieceType() != pieceType){
                diagonalMatch = false;
            }
        }

        for (int i=0, j=board.getSize()-1; i<board.getSize(); i++, j--){
            if (board.getBoard()[i][j]==null || board.getBoard()[i][j].getPieceType() != pieceType){
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
