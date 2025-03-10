package com.XX.LLD.PRACTICE.DesignTicketBooking.Model;

public class Seat {

    private String seatID;
    private int rowNumber;
    private int seatNumber;

    public Seat(String seatID, int rowNumber, int seatNumber) {
        this.seatID = seatID;
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
    }

    public String getSeatID() {
        return seatID;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
