package com.XX.LLD.PRACTICE.DesignCabBooking.Model;

import com.XX.LLD.PRACTICE.DesignCabBooking.Enum.TripStatus;

public class Trip {

    private Rider rider;
    private Cab cab;
    private TripStatus tripStatus;
    private Double price;
    private Location fromPoint;
    private Location toPoint;

    /**
     *
     * @param rider instance of Rider
     * @param cab  instance of Can
     * @param price  trip price
     * @param fromPoint  starting location coordinate
     * @param toPoint  final reaching location coordinate
     */
    public Trip(Rider rider, Cab cab, Double price, Location fromPoint, Location toPoint) {
        this.rider = rider;
        this.cab = cab;
        this.tripStatus = TripStatus.IN_PROGRESS;
        this.price = price;
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
    }

    /**
     * END's the {@Trip}
     */
    public void endTrip(){
        this.tripStatus = TripStatus.FINISHED;
    }
}
