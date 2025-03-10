package com.XX.LLD.PRACTICE.DesignTicketBooking.Model;

import java.time.Instant;
import java.util.Date;

public class SeatLock {

    private Seat seat;
    private Show show;
    private int timeoutInSecond;
    private Date lockTime;
    private String lockedBy;

    public SeatLock(Seat seat, Show show, int timeoutInSecond, Date lockTime, String lockedBy) {
        this.seat = seat;
        this.show = show;
        this.timeoutInSecond = timeoutInSecond;
        this.lockTime = lockTime;
        this.lockedBy = lockedBy;
    }

    public Seat getSeat() {
        return seat;
    }

    public Show getShow() {
        return show;
    }

    public int getTimeoutInSecond() {
        return timeoutInSecond;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public String getLockedBy() {
        return lockedBy;
    }

    public boolean isLockExpired() {
        Instant lockInstance = lockTime.toInstant().plusSeconds(timeoutInSecond);
        Instant currentInstant = new Date().toInstant();
        return lockInstance.isBefore(currentInstant);
    }
}
