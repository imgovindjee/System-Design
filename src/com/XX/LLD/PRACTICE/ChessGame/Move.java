package com.XX.LLD.PRACTICE.ChessGame;

import com.XX.LLD.PRACTICE.ChessGame.Pieces.Piece;

public class Move {

    private Piece piece;
    private int destinationRow;
    private int destinationColumn;

    public Move(Piece piece, int destinationRow, int destinationColumn) {
        this.piece = piece;
        this.destinationRow = destinationRow;
        this.destinationColumn = destinationColumn;
    }

    public Piece getPiece() {
        return piece;
    }
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public int getDestinationRow() {
        return destinationRow;
    }
    public void setDestinationRow(int destinationRow) {
        this.destinationRow = destinationRow;
    }
    public int getDestinationColumn() {
        return destinationColumn;
    }
    public void setDestinationColumn(int destinationColumn) {
        this.destinationColumn = destinationColumn;
    }
}
