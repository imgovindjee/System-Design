package com.XX.LLD.PRACTICE.ChessGame;

import com.XX.LLD.PRACTICE.ChessGame.Enum.Color.Color;
import com.XX.LLD.PRACTICE.ChessGame.Pieces.*;

public class Board {

    private final Piece[][] board;

    public Board() {
        this.board = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
//        WHITE PIECE INITIALIZATION
        board[0][0] = new Rook(0, 0, Color.WHITE);
        board[0][1] = new Knight(0, 1, Color.WHITE);
        board[0][2] = new Bishop(0, 2, Color.WHITE);
        board[0][3] = new Queen(0, 3, Color.WHITE);
        board[0][4] = new King(0, 4, Color.WHITE);
        board[0][5] = new Bishop(0, 5, Color.WHITE);
        board[0][6] = new Knight(0, 6, Color.WHITE);
        board[0][7] = new Rook(0, 7, Color.WHITE);
        initializePawn(board, Color.WHITE, 1);

//        BLACK PIECE INITIALIZATION
        board[7][0] = new Rook(7, 0, Color.BLACK);
        board[7][1] = new Knight(7, 1, Color.BLACK);
        board[7][2] = new Bishop(7, 2, Color.BLACK);
        board[7][3] = new Queen(7, 3, Color.BLACK);
        board[7][4] = new King(7, 4, Color.BLACK);
        board[7][5] = new Bishop(7, 5, Color.BLACK);
        board[7][6] = new Knight(7, 6, Color.BLACK);
        board[7][7] = new Rook(7, 7, Color.BLACK);
        initializePawn(board, Color.BLACK, 6);
    }

    private void initializePawn(Piece[][] board, Color color, int i) {
        for(int j=0; j<8; j++){
            board[i][j] = new Pawn(i, j, color);
        }
    }



    public void setPiece(Piece piece, int sourceRow, int sourceColumn) {
        board[sourceRow][sourceColumn] = piece;
    }

    public Piece getPiece(int destinationRow, int destinationColumn) {
        return board[destinationRow][destinationColumn];
    }

    public boolean isValidMove(Piece piece, int destinationRow, int destinationColumn) {
        if (piece == null || destinationRow < 0 || destinationRow > 7 || destinationColumn < 0 || destinationColumn > 7){
            return false;
        }

        Piece destinationPiece = board[destinationRow][destinationColumn];
        return (destinationPiece == null || destinationPiece.getColor() != piece.getColor())
                && piece.canMove(this, destinationRow, destinationColumn);
    }

    public boolean isCheckMate(Color color){
//        TO DO
        return false;
    }

    public boolean isStalemate(Color color){
//        TO DO
        return false;
    }
}
