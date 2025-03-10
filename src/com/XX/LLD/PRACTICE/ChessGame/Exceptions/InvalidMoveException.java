package com.XX.LLD.PRACTICE.ChessGame.Exceptions;

public class InvalidMoveException extends RuntimeException {

    public InvalidMoveException(final String message){
        super(message);
    }
}
