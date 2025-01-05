package com.XX.LLD.PRACTICE.DesignTicketBooking.Service;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Seat;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Show;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Provider.SeatLockProvider;

import java.util.ArrayList;
import java.util.List;

public class SeatAvailableService {

    BookingService bookingService;
    SeatLockProvider seatLockProvider;

    public SeatAvailableService(BookingService bookingService, SeatLockProvider seatLockProvider) {
        this.bookingService = bookingService;
        this.seatLockProvider = seatLockProvider;
    }

    public List<Seat> getAvailableSeats(Show show){
        List<Seat> allSeat = show.getScreen().getSeats();
        List<Seat> unavailableSeats = getUnavailableSeats(show);

        List<Seat> availableSeats = new ArrayList<>(allSeat);
        availableSeats.removeAll(unavailableSeats);
        return availableSeats;
    }

    public List<Seat> getUnavailableSeats(Show show){
        List<Seat> unavailableSeats = bookingService.getBookedSeats(show);
        unavailableSeats.addAll(seatLockProvider.getLockedSeats(show));
        return unavailableSeats;
    }
}
