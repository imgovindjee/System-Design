package com.XX.LLD.PRACTICE.ChessGame.Pieces;

import com.XX.LLD.PRACTICE.ChessGame.Board;
import com.XX.LLD.PRACTICE.ChessGame.Enum.Color.Color;

public class Knight extends Piece{

    public Knight(int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove(Board board, int destinationRow, int destinationColumn) {
        int rowDifference = Math.abs(destinationRow - row);
        int columnDifference = Math.abs(destinationColumn - column);
        return (rowDifference == 2 && columnDifference == 1) || (rowDifference == 1 && columnDifference == 2);
    }
}
