package com.XX.LLD.PRACTICE.DesignBookMyShow;

import com.XX.LLD.PRACTICE.DesignBookMyShow.Payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    Show show;
    Payment payment;
    List<Seat> bookedSeatList = new ArrayList<>();

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Seat> getBookedSeatList() {
        return bookedSeatList;
    }

    public void setBookedSeatList(List<Seat> bookedSeatList) {
        this.bookedSeatList = bookedSeatList;
    }
}
