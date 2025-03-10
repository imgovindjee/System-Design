package com.XX.LLD.PRACTICE.DesignCabBooking.Strategy;

import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Location;

public interface PricingStrategy {
    public Double findPrice(Location fromPoint, Location toPoint);
}
