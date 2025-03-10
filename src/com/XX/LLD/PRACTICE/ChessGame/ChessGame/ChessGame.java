package com.XX.LLD.PRACTICE.ChessGame.ChessGame;

import com.XX.LLD.PRACTICE.ChessGame.Board;
import com.XX.LLD.PRACTICE.ChessGame.Enum.Color.Color;
import com.XX.LLD.PRACTICE.ChessGame.Exceptions.InvalidMoveException;
import com.XX.LLD.PRACTICE.ChessGame.Move;
import com.XX.LLD.PRACTICE.ChessGame.Pieces.Piece;
import com.XX.LLD.PRACTICE.ChessGame.Players;

import java.util.Scanner;

public class ChessGame {

    private final Board board;
    private final Players[] players;
    private int currentPlayer;

    public ChessGame() {
        this.board = new Board();
        this.players = new Players[]{new Players(Color.WHITE), new Players(Color.BLACK)};
        this.currentPlayer = 0;
    }

    public void start() {
//        GAME LOOP
        while (!isGameOver()){
            Players player = players[currentPlayer];
            System.out.println(player.getColor() +"'s turn.");

//            GET MOVE
            Move move = getPlayerMove(player);
//            make the move play
            try {
                player.makeMove(board, move);
            } catch (InvalidMoveException exception){
                System.out.println(exception.getMessage());
                System.out.println("TRY AGAIN");
                continue;
            }

//            SWITCH TO NEXT PLAYER
            currentPlayer = (currentPlayer + 1) % 2;
        }

//        DISPLAY RESULT
        displayResult();
    }

    private boolean isGameOver(){
        return board.isCheckMate(players[0].getColor()) || board.isCheckMate(players[1].getColor())
                || board.isStalemate(players[0].getColor()) || board.isStalemate(players[1].getColor());
    }

    private Move getPlayerMove(Players player){
        Scanner sc = new Scanner(System.in);

//        PLAYER INPUT
        System.out.println("Enter Source Row: ");
        int sourceRow = sc.nextInt();
        System.out.println("Enter Source Column: ");
        int sourceColumn = sc.nextInt();
        System.out.println("Enter Destination Row: ");
        int destinationRow = sc.nextInt();
        System.out.println("Enter Destination Column: ");
        int destinationColumn = sc.nextInt();

//        HET MOVE FOR PLAYER
        Piece piece = board.getPiece(sourceRow, sourceColumn);
        if (piece == null || piece.getColor() != player.getColor()){
            throw new IllegalArgumentException("Invalid Piece Selections");
        }
        return new Move(piece, destinationRow, destinationColumn);
    }

    private void displayResult() {
        if (board.isCheckMate(Color.WHITE)) {
            System.out.println("\n-------------------------BLACK WINS BY CHECKMATE--------------------------");
        } else if (board.isCheckMate(Color.BLACK)) {
            System.out.println("\n-------------------------WHITE WINS BY CHECKMATE--------------------------");
        } else if (board.isStalemate(Color.BLACK) || board.isStalemate(Color.WHITE)) {
            System.out.println("\n-------------------------THE GAME ENDS IN A STALEMATE--------------------------");
        }
    }
}
