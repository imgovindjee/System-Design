package com.XX.LLD.PRACTICE.ChessGame;

import com.XX.LLD.PRACTICE.ChessGame.Enum.Color.Color;
import com.XX.LLD.PRACTICE.ChessGame.Exceptions.InvalidMoveException;
import com.XX.LLD.PRACTICE.ChessGame.Pieces.Piece;

public class Players {

    private Color color;

    public Players(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public void makeMove(Board board, Move move){
        Piece piece = move.getPiece();
        int destinationRow = move.getDestinationRow();
        int destinationColumn = move.getDestinationColumn();
        if (board.isValidMove(piece, destinationRow, destinationColumn)){
            int sourceRow = piece.getRow();
            int sourceColumn = piece.getColumn();

            board.setPiece(null, sourceRow, sourceColumn);
            board.setPiece(piece, destinationRow, destinationColumn);
            piece.setRow(destinationRow);
            piece.setColumn(destinationColumn);
        } else {
            throw new InvalidMoveException("Invalid Move!!");
        }
    }
}
