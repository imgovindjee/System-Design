package com.XX.LLD.PRACTICE.DesignTicketBooking.Model;

import java.util.Date;

public class Show {

    private String showID;
    private Movie movie;
    private Screen screen;
    private Date startTime;
    private int durationInSecond;

    public Show(String showID, Movie movie, Screen screen, Date startTime, int durationInSecond) {
        this.showID = showID;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.durationInSecond = durationInSecond;
    }

    public String getShowID() {
        return showID;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public Date getStartTime() {
        return startTime;
    }

    public int getDurationInSecond() {
        return durationInSecond;
    }
}
