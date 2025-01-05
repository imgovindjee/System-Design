package com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase;

import com.XX.LLD.PRACTICE.DesignCabBooking.Exceptions.RiderAlreadyExistsException;
import com.XX.LLD.PRACTICE.DesignCabBooking.Exceptions.RiderNotFoundException;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Rider;

import java.util.HashMap;
import java.util.Map;

public class RiderManager {

    private Map<String, Rider> riders = new HashMap<>();

    /**
     * create a Rider
     *
     * @param newRider instance of {@Rider}
     */
    public void createRider(Rider newRider){
        if(riders.containsKey(newRider.getRiderID())){
            throw new RiderAlreadyExistsException();
        }
        riders.put(newRider.getRiderID(), newRider);
    }

    /**
     * Helps in getting a RIDER
     *
     * @param riderID Instance riderID as unique riderID
     * @return type {@Rider}
     */
    public Rider getRider(String riderID){
        if(!riders.containsKey(riderID)){
            throw new RiderNotFoundException();
        }
        return riders.get(riderID);
    }
}
