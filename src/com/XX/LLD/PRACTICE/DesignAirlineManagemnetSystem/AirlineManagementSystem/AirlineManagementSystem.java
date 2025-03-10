package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.AirlineManagementSystem;

import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Aircraft;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Booking.Booking;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Booking.BookingManager;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Flight.Flight;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Flight.FlightSearch;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Passenger;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Payment.Payment;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Payment.PaymentProcessor;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Seat.Seat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AirlineManagementSystem {

    private final List<Flight> flightList;
    private final List<Aircraft> aircraftList;
    private final FlightSearch flightSearch;
    private final BookingManager bookingManager;
    private final PaymentProcessor paymentProcessor;

    /**
     * {@AllArgsConstructor}
     */
    public AirlineManagementSystem() {
        this.aircraftList = new ArrayList<>();
        this.flightList = new ArrayList<>();
        this.flightSearch = new FlightSearch(flightList);
        this.bookingManager = BookingManager.getInstance();
        this.paymentProcessor = PaymentProcessor.getInstance();
    }

//    ADD FLIGHT
    public void addFlight(Flight flight){
        flightList.add(flight);
    }

//    ADD AIRCRAFT
    public void addAircraft(Aircraft aircraft){
        aircraftList.add(aircraft);
    }

//    SEARCH FLIGHT
    public List<Flight> searchFlight(String source, String destination, LocalDate date) {
        return  flightSearch.searchFlight(source, destination, date);
    }

//    BOOK FLIGHT
    public Booking bookFlight(Flight flight, Passenger passenger, Seat seat, double price) {
        return bookingManager.createBooking(flight, passenger, seat, price);
    }

//    CANCEL BOOKING
    public void cancelBooking(String bookingNumber){
        bookingManager.cancelBooking(bookingNumber);
    }

//    PROCESS PAYMENT
    public void processPayment(Payment payment){
        paymentProcessor.processPayment(payment);
    }
}
