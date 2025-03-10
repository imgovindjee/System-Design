package com.XX.LLD.PRACTICE.DesignCabBooking.Enum.HandlesOpenClosePrinciple;

public class InProgressTripStatus implements TripStatus{

    @Override
    public String getTripStatus() {
        return "IN_PROGRESS";
    }
}
