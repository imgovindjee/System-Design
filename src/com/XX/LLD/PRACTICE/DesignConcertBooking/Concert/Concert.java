package com.XX.LLD.PRACTICE.DesignConcertBooking.Concert;

import com.XX.LLD.PRACTICE.DesignConcertBooking.Seat.Seat;

import java.time.LocalDateTime;
import java.util.List;

public class Concert {

    private String concertID;
    private String artist;
    private String venue;
    private List<Seat> seatList;
    private LocalDateTime dateTime;

    public Concert(String concertID, String artist, String venue, List<Seat> seatList, LocalDateTime dateTime) {
        this.concertID = concertID;
        this.artist = artist;
        this.venue = venue;
        this.seatList = seatList;
        this.dateTime = dateTime;
    }

    public String getConcertID() {
        return concertID;
    }
    public void setConcertID(String concertID) {
        this.concertID = concertID;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public List<Seat> getSeatList() {
        return seatList;
    }
    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
