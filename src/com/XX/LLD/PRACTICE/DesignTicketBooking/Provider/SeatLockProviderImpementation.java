package com.XX.LLD.PRACTICE.DesignTicketBooking.Provider;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Exceptions.SeatTemporaryUnavailableException;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Seat;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.SeatLock;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Model.Show;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatLockProviderImpementation implements SeatLockProvider{

    private int lockTimeOut; // BONUS FEATURE
    private Map<Show, Map<Seat, SeatLock>> locks;

    public SeatLockProviderImpementation(int lockTimeOut) {
        this.lockTimeOut = lockTimeOut;
        this.locks = new HashMap<>();
    }

    /**
     *
     * @param show
     * @param seat
     * @param user
     */
    @Override
    synchronized public void lockSeats(Show show, List<Seat> seat, String user) {
        for (Seat seat1:seat){
            if(!isSeatLocked(show, seat1)){
                System.out.println("");
//                throw new SeatTemporaryUnavailableException();
            }
        }

        for (Seat seat1:seat){
            lockSeats(show, seat1, user, lockTimeOut);
        }
    }

    /**
     *
     * @param show
     * @param seat
     * @param user
     */
    @Override
    public void unlockSeats(Show show, List<Seat> seat, String user) {
        for (Seat seat1:seat){
            if(validateLock(show, seat1, user)){
                unlockSeat(show, seat1);
            }
        }
    }

    /**
     *
     * @param show
     * @param seat
     * @param user
     * @return
     */
    @Override
    public boolean validateLock(Show show, Seat seat, String user) {
        return isSeatLocked(show, seat)
                && locks.get(show).get(seat).getLockedBy().equals(user);
    }

    /**
     *
     * @param show
     * @return
     */
    @Override
    public List<Seat> getLockedSeats(Show show) {
        if(!locks.containsKey(show)){
            System.out.println("Seat for the show is not locked");
            return new ArrayList<>();
        }

        List<Seat> lockedSeat = new ArrayList<>();
        for (Seat seat: locks.get(show).keySet()){
            if(isSeatLocked(show, seat)){
                lockedSeat.add(seat);
            }
        }
        return lockedSeat;
    }


    /**
     *
     * @param show
     * @param seat
     * @return
     */
    private boolean isSeatLocked(Show show, Seat seat){
        return locks.containsKey(show)
                && locks.get(show).containsKey(seat)
                && !locks.get(show).get(seat).isLockExpired();
    }

    /**
     *
     * @param show
     * @param seat
     * @param user
     * @param lockTimeOut
     */
    private void lockSeats(Show show, Seat seat, String user, int lockTimeOut){
        if(!locks.containsKey(show)){
            System.out.println("This show don't Exists.");
            return;
        }
        locks.get(show).remove(seat);
        System.out.println("Seat with seatId:"+seat.getSeatID()
                + ", for the show: "+show.getMovie().getMovieName()
                +" has been locked.");
    }

    /**
     *
     * @param show
     * @param seat
     */
    private void unlockSeat(Show show, Seat seat){
        if(!locks.containsKey(show)){
            System.out.println("Seat is already locked");
            return;
        }
        locks.get(show).remove(seat);
        System.out.println("Seat with seatID: "+seat.getSeatID()+
                " has been unlocked for the show: "+show.getMovie().getMovieName());
    }
}
