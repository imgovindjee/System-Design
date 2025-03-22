package com.XX.LLD.PRACTICE.DesignConcertBooking.Concert;

import com.XX.LLD.PRACTICE.DesignConcertBooking.Booking.Booking;
import com.XX.LLD.PRACTICE.DesignConcertBooking.Exceptions.SeatNotAvailableException;
import com.XX.LLD.PRACTICE.DesignConcertBooking.Seat.Seat;
import com.XX.LLD.PRACTICE.DesignConcertBooking.Seat.SeatStatus;
import com.XX.LLD.PRACTICE.DesignConcertBooking.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;




public class ConcertBooking {

    private static ConcertBooking concertBooking;
    private final Map<String, Concert> concertMap;
    private final Map<String, Booking> bookingMap;
    private final Object lock = new Object();

    private ConcertBooking() {
        this.concertMap = new ConcurrentHashMap<>();
        this.bookingMap = new ConcurrentHashMap<>();
    }

    public static synchronized ConcertBooking getInstance() {
        if (concertBooking == null) {
            concertBooking = new ConcertBooking();
        }
        return concertBooking;
    }

    public void addConcert(Concert concert){
        concertMap.put(concert.getConcertID(), concert);
    }

    public Concert getConcert (String concertID) {
        return concertMap.get(concertID);
    }

    public List<Concert> searchConcert(String artist, String venue, LocalDateTime dateTime) {
        return concertMap.values().stream()
                .filter(concert -> concert.getArtist().equalsIgnoreCase(artist) && concert.getVenue().equalsIgnoreCase(venue) && concert.getDateTime().equals(dateTime))
                .collect(Collectors.toList());
    }

    public Booking bookTicket(User user, Concert concert, List<Seat> seatList){
        synchronized (lock) {
            for (Seat sl:seatList) {
                if (sl.getSeatStatus() != SeatStatus.AVAILABLE) {
                    throw new SeatNotAvailableException("Seat "+sl.getSeatNumber()+" isn't available");
                }
            }

            seatList.forEach(Seat::book);

//            CREATE BOOKING
            String bookingID = generateBookingID();
            Booking booking = new Booking(bookingID, user, seatList, concert);
            bookingMap.put(bookingID, booking);

//            PAYMENT
            processPayment(booking);

//            CONFIRM-BOOKING
            booking.confirmBooking();

            System.out.println("Booking "+bookingID+" - "+booking.getSeatList().size()+" seats booked");
            return booking;
        }
    }

    public void cancelBooking(String bookingID) {
        Booking booking = bookingMap.get(bookingID);
        if (booking != null) {
            booking.cancelBooking();
            bookingMap.remove(bookingID);
            System.out.println("Booking "+booking.getBookingID()+" has been cancelled.");
            return;
        }
        System.out.println("No Booking available for cancel.");
    }

    private String generateBookingID() {
        return "CONCERT"+ UUID.randomUUID();
    }

    private synchronized void processPayment(Booking booking){
//        BUSINESS LOGIC
        System.out.println("\n\n\n--------PAYMENT DONE---------\n\n\n");
    }
}
