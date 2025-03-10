package com.XX.LLD.PRACTICE.DesignCabBooking.Strategy;

import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Cab;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Location;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Rider;

import java.util.List;

public interface CabMatchingStrategy {
    public Cab matchCabToRider(Rider rider, List<Cab> cab, Location fromPoint, Location toPoint);
}
