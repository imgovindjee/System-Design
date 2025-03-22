package com.XX.LLD.PRACTICE.DesignConcertBooking.Seat;

import com.XX.LLD.PRACTICE.DesignConcertBooking.Exceptions.SeatNotAvailableException;

public class Seat {

    private String seatID;
    private String seatNumber;
    private SeatType seatType;
    private double price;
    private SeatStatus seatStatus;

    public Seat(String seatID, String seatNumber, SeatType seatType, double price) {
        this.seatID = seatID;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.price = price;
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    public synchronized void book() {
        if (seatStatus == SeatStatus.AVAILABLE) {
            seatStatus = SeatStatus.BOOKED;
        } else {
            throw new SeatNotAvailableException("Seat already Booked or Reserved");
        }
    }

    public synchronized void release() {
        if (seatStatus == SeatStatus.BOOKED) {
            seatStatus = SeatStatus.AVAILABLE;
            System.out.println("Seat with ID-"+seatID+" is released.");
        }
    }
    

    public String getSeatID() {
        return seatID;
    }
    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public SeatType getSeatType() {
        return seatType;
    }
    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public SeatStatus getSeatStatus() {
        return seatStatus;
    }
    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}
