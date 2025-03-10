package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Booking;

import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Flight.Flight;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Passenger;
import com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Seat.Seat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingManager {

    private static BookingManager bookingManager;
    private final Map<String, Booking> bookingMap;
    private final Object lock = new Object();
    private final AtomicInteger bookingCounter = new AtomicInteger(0);

    private BookingManager() {
        this.bookingMap = new ConcurrentHashMap<>();
    }

    public static synchronized BookingManager getInstance() {
        if (bookingManager == null) {
            bookingManager = new BookingManager();
        }
        return bookingManager;
    }

//    CREATE BOOKING
    public Booking createBooking(Flight flight, Passenger passenger, Seat seat, double price) {
        String bookingNumber = generateBookingNumber();

        Booking booking = new Booking(bookingNumber, flight, passenger, seat, price);
        synchronized (lock) {
            bookingMap.put(bookingNumber, booking);
        }
        return booking;
    }

//    CANCEL BOOKING
    public void cancelBooking(String bookingNumber) {
        synchronized (lock) {
            Booking booking = bookingMap.get(bookingNumber);
            if (booking != null) {
                booking.cancel();
            }
        }
    }

    private String generateBookingNumber() {
        int bookingID = bookingCounter.incrementAndGet();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return "BKG" + timestamp + String.format("%06d", bookingID);
    }
}
