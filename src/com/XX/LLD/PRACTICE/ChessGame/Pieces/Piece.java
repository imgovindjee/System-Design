package com.XX.LLD.PRACTICE.ChessGame.Pieces;

import com.XX.LLD.PRACTICE.ChessGame.Board;
import com.XX.LLD.PRACTICE.ChessGame.Enum.Color.Color;

public abstract class Piece {

    protected int row;
    protected int column;
    protected Color color;

    public Piece(int row, int column, Color color) {
        this.row = row;
        this.column = column;
        this.color = color;
    }

    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     *  ABSTRACT FUNCTION
     * @param board playing-board
     * @param destinationRow where to go in row
     * @param destinationColumn where to go in column
     * @return type {@BOOLEAN}
     */
    public abstract boolean canMove(Board board, int destinationRow, int destinationColumn);
}
