package com.XX.LLD.PRACTICE.DesignCabBooking.Controller;

import com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase.CabManager;
import com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase.TripManager;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Cab;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Location;

public class CabController {

    private CabManager cabManager;
    private TripManager tripManager;

    /**
     * {@AllArgsConstructor} CONSTRUCTOR
     *
     * @param cabManager  instance of Cab-Manager
     * @param tripManager Instance of Trip-Manager
     */
    public CabController(CabManager cabManager, TripManager tripManager) {
        this.cabManager = cabManager;
        this.tripManager = tripManager;
    }

    /**
     * Register Cab
     *
     * @param cabID     instance of CabID, unique ID
     * @param driverName    instance of driver Name
     */
    public void registerCab(String cabID, String driverName){
        cabManager.createCab(new Cab(cabID, driverName));
        System.out.println("A new cab with cabID: "+cabID+" and driverName: "+driverName+" has been created..");
    }

    /**
     * Update Cab Location
     *
     * @param cabID  instance of CabID, unique ID
     * @param newXCoordinate    new Location of X-Coordinate
     * @param newYCoordinate    new Location of Y-Coordinate
     */
    public void updateCabLocation(String cabID, Double newXCoordinate, Double newYCoordinate){
        cabManager.updateCabAvailable(cabID, new Location(newXCoordinate, newYCoordinate));
        System.out.println("Car with carID: "+cabID+" location has been updated to {"+newXCoordinate+", "+newYCoordinate+"}");
    }

    /**
     * Update Cab Availability
     *
     * @param cabID instance of CabID, unique ID
     * @param newAvailability   set new availability
     */
    public void updateCabAvailability(String cabID, boolean newAvailability){
        cabManager.updateCabAvailability(cabID, newAvailability);
        System.out.println("Cab with cabID: "+cabID+", availability has been updated to "+newAvailability);
    }

    /**
     * End's Trip
     *
     * @param cabID instance of CabID
     */
    public void endTrip(String cabID){
        tripManager.endTrip(cabManager.getCab(cabID));
        System.out.println("Cab with cabID: "+cabID+" trip has been ended.");
    }
}
