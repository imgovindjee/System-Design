package com.XX.LLD.PRACTICE.DesignConcertBooking.Exceptions;

public class SeatNotAvailableException extends RuntimeException {

    public SeatNotAvailableException(String message) {
        super(message);
    }
}
