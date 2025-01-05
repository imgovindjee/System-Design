package com.XX.LLD.PRACTICE.DesignTicketBooking.Provider;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Seat;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Show;

import java.util.List;

public interface SeatLockProvider {
    public void lockSeats(Show show, List<Seat> seat, String user);
    public void unlockSeats(Show show, List<Seat> seat, String user);
    public boolean validateLock(Show show, Seat seat, String user);
    public List<Seat> getLockedSeats(Show show);
}
