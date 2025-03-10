package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Booking;

import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Flight.Flight;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Passenger;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Seat.Seat;

public class Booking {

    private final String bookingNumber;
    private final Flight flight;
    private final Passenger passenger;
    private final Seat seat;
    private final double price;
    private BookingStatus bookingStatus;

    public Booking(String bookingNumber, Flight flight, Passenger passenger, Seat seat, double price) {
        this.bookingNumber = bookingNumber;
        this.flight = flight;
        this.passenger = passenger;
        this.seat = seat;
        this.price = price;
        this.bookingStatus = BookingStatus.CONFIRMED;
    }

    public void cancel() {
        this.bookingStatus = BookingStatus.CANCELLED;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }
    public Flight getFlight() {
        return flight;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public Seat getSeat() {
        return seat;
    }
    public double getPrice() {
        return price;
    }
    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
}
