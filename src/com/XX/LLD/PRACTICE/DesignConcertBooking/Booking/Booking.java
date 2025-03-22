package com.XX.LLD.PRACTICE.DesignConcertBooking.Booking;

import com.XX.LLD.PRACTICE.DesignConcertBooking.Concert.Concert;
import com.XX.LLD.PRACTICE.DesignConcertBooking.Seat.Seat;
import com.XX.LLD.PRACTICE.DesignConcertBooking.User;

import java.util.List;

public class Booking {

    private String bookingID;
    private User user;
    private BookingStatus bookingStatus;
    private double totalPrice;
    private List<Seat> seatList;
    private Concert concert;

    public Booking(String bookingID, User user, double totalPrice, List<Seat> seatList, Concert concert) {
        this.bookingID = bookingID;
        this.user = user;
        this.totalPrice = totalPrice;
        this.seatList = seatList;
        this.concert = concert;
        this.bookingStatus = BookingStatus.PENDING;
    }

    public Booking(String bookingID, User user, List<Seat> seatList, Concert concert) {
        this.bookingID = bookingID;
        this.user = user;
        this.seatList = seatList;
        this.concert = concert;
        this.bookingStatus = BookingStatus.PENDING;
    }

    private double calculateTotalPrice() {
        return seatList.stream().mapToDouble(Seat::getPrice).sum();
    }

    public void confirmBooking() {
        if (bookingStatus == BookingStatus.PENDING) {
            bookingStatus = BookingStatus.CONFIRMED;
//            BUSINESS LOGIC
        }
    }

    public void cancelBooking() {
        if ( bookingStatus == BookingStatus.CONFIRMED) {
            bookingStatus = BookingStatus.CANCELLED;
            seatList.forEach(Seat::release);
            System.out.println("Booking " +bookingID+" is Cancelled");
//            BUSINESS LOGIC
        }
    }

    public String getBookingID() {
        return bookingID;
    }
    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public List<Seat> getSeatList() {
        return seatList;
    }
    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
    public Concert getConcert() {
        return concert;
    }
    public void setConcert(Concert concert) {
        this.concert = concert;
    }
}
