package com.XX.LLD.PRACTICE.DesignTicTacToe.Model;

import com.XX.LLD.PRACTICE.DesignTicTacToe.Enum.PieceType;

public class PlayingPiece {

    private PieceType pieceType;

    public PlayingPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
