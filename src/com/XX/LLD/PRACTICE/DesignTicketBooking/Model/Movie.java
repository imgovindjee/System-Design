package com.XX.LLD.PRACTICE.DesignTicketBooking.Model;

public class Movie {

    private String movieID;
    private String movieName;

    public Movie(String movieID, String movieName) {
        this.movieID = movieID;
        this.movieName = movieName;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
