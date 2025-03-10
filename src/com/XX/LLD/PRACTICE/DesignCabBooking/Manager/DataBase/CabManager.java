package com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase;

import com.XX.LLD.PRACTICE.DesignCabBooking.Exceptions.CabAlreadyExistsException;
import com.XX.LLD.PRACTICE.DesignCabBooking.Exceptions.CabNotFoundException;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Cab;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CabManager {

    private Map<String, Cab> cabs = new HashMap<>();

    /**
     * helps in CREATING A CAB
     *
     * @param newCab instance of {@Cab}
     */
    public void createCab(Cab newCab){
        if(cabs.containsKey(newCab.getCarID())){
            throw new CabAlreadyExistsException();
        }
        cabs.put(newCab.getCarID(), newCab);
    }

    /**
     *
     * @param cabID unique canID
     * @return type {@Cab}
     */
    public Cab getCab(String cabID){
        if(!cabs.containsKey(cabID)) {
            throw new CabNotFoundException();
        }
        return cabs.get(cabID);
    }

    /**
     * UPDATE THE CAB LOCATION
     *
     * @param cabID unique canID
     * @param newLocation  new location of that particular cab
     */
    public void updateCabAvailable(String cabID, Location newLocation) {
        if(!cabs.containsKey(cabID)){
            throw new CabNotFoundException();
        }
        cabs.get(cabID).setCurrentLocation(newLocation);
    }

    /**
     * UPDATE THE CAB-AVAILABILITY
     *
     * @param cabID  unique cabID
     * @param newAvailability  new Availability of the car
     */
    public void updateCabAvailability(String cabID, boolean newAvailability){
        if(!cabs.containsKey(cabID)){
            throw new CabNotFoundException();
        }
        cabs.get(cabID).setAvailable(newAvailability);
    }

    /**
     * GET ALL THE CAB-LIST
     *
     * @param fromPoint what is the LOCATION, to start the {@Trip}
     * @param distance  total distance of {@Trip}
     * @return type {@list} of {@Trip}
     */
    public List<Cab> getAllCabs(Location fromPoint, Double distance){
        List<Cab> cabList = new ArrayList<>();
        for (Cab cab:cabs.values()){
            if(cab.isAvailable() && cab.getCurrentLocation().distance(fromPoint) <= distance){
                cabList.add(cab);
            }
        }
        return cabList;
    }
}
