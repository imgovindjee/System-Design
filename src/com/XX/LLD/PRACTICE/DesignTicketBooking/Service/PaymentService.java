package com.XX.LLD.PRACTICE.DesignTicketBooking.Service;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.BadRequestException;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Booking;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Provider.SeatLockProvider;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {

    private int allowedRetries;
    private SeatLockProvider seatLockProvider;
    Map<Booking, Integer> bookingFailures;

    /**
     * {@Constructor}
     *
     * @param allowedRetries {@NotNull}
     * @param seatLockProvider {@NotNull}
     */
    public PaymentService(int allowedRetries, SeatLockProvider seatLockProvider) {
        this.allowedRetries = allowedRetries;
        this.seatLockProvider = seatLockProvider;
        this.bookingFailures = new HashMap<>();
    }

    public void processPaymentFailed(Booking booking, String user){
        if(!booking.getUser().equals(user)){
            System.out.println("USER NOT FOUND\n" +
                    "UserName: "+user);
//            throw new BadRequestException();
        }

        if(!bookingFailures.containsKey(booking)){
            bookingFailures.put(booking, 0);
        }
        int currentFailureCount = bookingFailures.get(booking);
        int newFailureCount = currentFailureCount + 1;
        bookingFailures.put(booking, newFailureCount);
        if(newFailureCount > allowedRetries){
            seatLockProvider.unlockSeats(booking.getShow(), booking.getSeatsBooked(), booking.getUser());
        }
        System.out.println("User: "+user+" booking has been failed");
    }
}
