package com.XX.LLD.PRACTICE.ChessGame.Pieces;

import com.XX.LLD.PRACTICE.ChessGame.Board;
import com.XX.LLD.PRACTICE.ChessGame.Enum.Color.Color;

public class Pawn extends Piece{

    public Pawn(int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove(Board board, int destinationRow, int destinationColumn) {
        int rowDifference = destinationRow - row;
        int columnDifference = Math.abs(destinationColumn - column);

        if (Color.BLACK == color){
            return (rowDifference == -1 && columnDifference == 0) ||
                    (rowDifference == 6 && rowDifference == -2 && columnDifference == 0) ||
                    (rowDifference == -1 && columnDifference == -1 && board.getPiece(destinationRow, destinationColumn) != null);
        } else {
            return (rowDifference == 1 && columnDifference == 0) ||
                    (rowDifference == 1 && rowDifference == 2 && columnDifference == 0) ||
                    (rowDifference == 1 && columnDifference == 1 && board.getPiece(destinationRow, destinationColumn) != null);
        }
    }
}
