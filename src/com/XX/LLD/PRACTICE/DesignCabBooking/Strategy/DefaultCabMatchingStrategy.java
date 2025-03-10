package com.XX.LLD.PRACTICE.DesignCabBooking.Strategy;

import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Cab;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Location;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Rider;

import java.util.List;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy{

    /**
     *
     * @param rider  who is the rider
     * @param cab  which cab
     * @param fromPoint  starting point
     * @param toPoint  ending point
     * @return type {@Cab}
     */
    @Override
    public Cab matchCabToRider(Rider rider, List<Cab> cab, Location fromPoint, Location toPoint) {
        if(cab.isEmpty()){
            return null;
        }
        return cab.get(0);
    }
}
