package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Flight;

import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Seat.Seat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {

    private String flightNumber;
    private String source;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private List<Seat> availableSeatList;

    public Flight(String flightNumber, String source, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeatList = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightName(String flightName) {
        this.flightNumber = flightName;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public List<Seat> getAvailableSeatList() {
        return availableSeatList;
    }
    public void setAvailableSeatList(List<Seat> availableSeatList) {
        this.availableSeatList = availableSeatList;
    }
}
