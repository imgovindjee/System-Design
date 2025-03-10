package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Flight;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private final List<Flight> flightList;

    public FlightSearch(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Flight> searchFlight(String source, String destination, LocalDate localDate) {
        return flightList.stream()
                .filter(flight -> flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination) && flight.getDepartureTime().toLocalDate().equals(localDate))
                .collect(Collectors.toList());
    }
}
