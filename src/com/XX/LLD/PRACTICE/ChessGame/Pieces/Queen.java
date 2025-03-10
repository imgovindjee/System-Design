package com.XX.LLD.PRACTICE.ChessGame.Pieces;

import com.XX.LLD.PRACTICE.ChessGame.Board;
import com.XX.LLD.PRACTICE.ChessGame.Enum.Color.Color;

public class Queen extends Piece{

    public Queen(int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove(Board board, int destinationRow, int destinationColumn) {
        int rowDifference = Math.abs(destinationRow - row);
        int columnDifference = Math.abs(destinationColumn - column);
        return (rowDifference == columnDifference) || (rowDifference == row || columnDifference == column);
    }
}
