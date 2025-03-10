package com.XX.LLD.PRACTICE.ChessGame.Pieces;

import com.XX.LLD.PRACTICE.ChessGame.Board;
import com.XX.LLD.PRACTICE.ChessGame.Enum.Color.Color;

public class King extends Piece{

    public King(int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove(Board board, int destinationRow, int destinationColumn) {
        int rowDifference = destinationRow - row;
        int columnDifference = destinationColumn - column;
        return rowDifference <= 1 && columnDifference <= 1;
    }
}
