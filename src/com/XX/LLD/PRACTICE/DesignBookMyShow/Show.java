package com.XX.LLD.PRACTICE.DesignBookMyShow;

import com.XX.LLD.PRACTICE.DesignBookMyShow.Movie.Movie;

import java.util.ArrayList;
import java.util.List;

public class Show {

    int showID;
    Movie movie;
    Screen screen;
    int showStartTime;
    List<Integer> seatIDs_bookedlist = new ArrayList<>();

    public int getShowID() {
        return showID;
    }

    public void setShowID(int showID) {
        this.showID = showID;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public int getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime) {
        this.showStartTime = showStartTime;
    }

    public List<Integer> getBookedSeatIDList() {
        return seatIDs_bookedlist;
    }

    public void setBookedSeatIDList(List<Integer> seatIDs_bookedlist) {
        this.seatIDs_bookedlist = seatIDs_bookedlist;
    }
}
