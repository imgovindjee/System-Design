package com.XX.LLD.PRACTICE.DesignTicketBooking.Model;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private String screenID;
    private String screenName;
    private Theatre theatre;
    private List<Seat> seats;

    public Screen(String screenID, String screenName, Theatre theatre) {
        this.screenID = screenID;
        this.screenName = screenName;
        this.theatre = theatre;
        this.seats = new ArrayList<>();
    }

    public String getScreenID() {
        return screenID;
    }

    public String getScreenName() {
        return screenName;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void addSeat(Seat seat){
        this.seats.add(seat);
    }
}
