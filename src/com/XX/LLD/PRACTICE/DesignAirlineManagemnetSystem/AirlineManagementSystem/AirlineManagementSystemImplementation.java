package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.AirlineManagementSystem;

import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Aircraft;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Booking.Booking;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Flight.Flight;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Passenger;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Seat.Seat;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Seat.SeatType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class AirlineManagementSystemImplementation {

    public static void run() {
//        CREATE A SYSTEM
        AirlineManagementSystem airlineManagementSystem = new AirlineManagementSystem();

//        CREATE USERS
        Passenger passenger = new Passenger("P001", "Priyanka", "priyanka@gmail.com", "1234567890");

//        CREATE FLIGHT
        Flight flight1 = createFlight(airlineManagementSystem, "F001", "New York", "London", 1, 2);
        Flight flight2 = createFlight(airlineManagementSystem, "F002", "Pairs", "Tokyo", 3, 5);
        Flight flight3 = createFlight(airlineManagementSystem, "F200", "London", "Paris", 3, 5);
        Flight flight4 = createFlight(airlineManagementSystem, "F112", "London", "Tokyo", 2, 4);
        Flight flight5 = createFlight(airlineManagementSystem,"F212", "Pairs", "Belgium", 4, 2);

//        CREATE AIRCRAFT
        Aircraft aircraft1 = new Aircraft("A001", 300, "Boeing 776");
        Aircraft aircraft2 = new Aircraft("A002", 450, "Airbus A076");

        airlineManagementSystem.addAircraft(aircraft1);
        airlineManagementSystem.addAircraft(aircraft2);

//        SEARCH FLIGHT
        List<Flight> searchFlightList = airlineManagementSystem.searchFlight("New York", "London", LocalDate.now().plusDays(1));
        System.out.println("\n-----------------------------------SEARCH RESULT-------------------------------------");
        for (Flight sfl:searchFlightList){
            System.out.println("Flight: "+sfl.getFlightNumber());
            System.out.println("Way: "+sfl.getSource()+" to "+sfl.getDestination());
        }


        Seat seat = new Seat("25A", SeatType.ECONOMY);

//        BOOK FLIGHT
        Booking booking = airlineManagementSystem.bookFlight(flight1, passenger, seat, 5449);
        if (booking != null) {
            System.out.println("\n--------------------------------------");
            System.out.println("Booking Successful...\nBookingID: "+booking.getBookingNumber());
        } else {
            System.out.println("Booking Failed");
        }

//        CANCEL A BOOKING
        airlineManagementSystem.cancelBooking(booking.getBookingNumber());
        System.out.println("\n---------------------------------------------\n" +
                "Booking Cancelled.");
    }


    private static Flight createFlight(AirlineManagementSystem airlineManagementSystem, String flightNumber, String source, String destination, int days, int hours){
        LocalDateTime departureTime = LocalDateTime.now().plusDays(days);
        LocalDateTime arrivalTime = departureTime.plusHours(hours);
        Flight flight = new Flight(flightNumber, source, destination, departureTime, arrivalTime);

        airlineManagementSystem.addFlight(flight);
        return flight;
    }
}
