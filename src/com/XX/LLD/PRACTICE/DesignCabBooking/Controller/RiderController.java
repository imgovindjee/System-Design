package com.XX.LLD.PRACTICE.DesignCabBooking.Controller;

import com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase.RiderManager;
import com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase.TripManager;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Location;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Rider;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Trip;

import java.util.List;

public class RiderController {

    private RiderManager riderManager;
    private TripManager tripManager;

    /**
     * {@AllArgsConstructor} CONSTRUCTOR
     *
     * @param riderManager  helps in creating a rider
     * @param tripManager helps in creating a trip
     */
    public RiderController(RiderManager riderManager, TripManager tripManager) {
        this.riderManager = riderManager;
        this.tripManager = tripManager;
    }

    /**
     * Register a Rider
     *
     * @param riderID   unique rider ID
     * @param riderName  rider Name
     */
    public void registerRider(String riderID, String riderName){
        riderManager.createRider(new Rider(riderID, riderName));
        System.out.println("A new rider with riderID: "+riderID+" and riderName: "+riderName+" has been created..");
    }

    /**
     * BOOK A RIDE (TRIP)
     *
     * @param riderID     args as unique ID rider
     * @param sourceX     starting from point X
     * @param sourceY     starting to point Y
     * @param destinationX      reached to point X
     * @param destinationY      reached to point Y
     */
    public void book(String riderID, Double sourceX, Double sourceY, Double destinationX, Double destinationY){
        tripManager.createTrip(
                riderManager.getRider(riderID),
                new Location(sourceX, sourceY),
                new Location(destinationX, destinationY)
        );
        System.out.println("A new Trip has been booked.");
    }

    /**
     *
     * @param riderID args as unique ID of rider
     * @return type {@list} of {@Trip}
     */
    public List<Trip> fetchHistory(String riderID){
        return tripManager.tripHistory(riderManager.getRider(riderID));
    }
}
