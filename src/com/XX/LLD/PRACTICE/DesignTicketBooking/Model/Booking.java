package com.XX.LLD.PRACTICE.DesignTicketBooking.Model;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.InvalidStateException;

import java.util.List;

public class Booking {

    private String bookingID;
    private Show show;
    private List<Seat> seatsBooked;
    private String user;
    private BookingStatus bookingStatus;

    public Booking(String bookingID, Show show, List<Seat> seatsBooked, String user) {
        this.bookingID = bookingID;
        this.show = show;
        this.seatsBooked = seatsBooked;
        this.user = user;
        this.bookingStatus = BookingStatus.CREATED;
    }

    public String getBookingID() {
        return bookingID;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeatsBooked() {
        return seatsBooked;
    }

    public String getUser() {
        return user;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public boolean isConfirmed(){
        return this.bookingStatus == BookingStatus.CONFIRMED;
    }

    public void confirmBooking(){
        if(this.bookingStatus != BookingStatus.CREATED){
            throw new InvalidStateException();
        }
        this.bookingStatus = BookingStatus.CONFIRMED;
    }

    public void expireBooking(){
        if(this.bookingStatus != BookingStatus.CREATED){
            throw new InvalidStateException();
        }
        this.bookingStatus = BookingStatus.EXPIRED;
    }
}
