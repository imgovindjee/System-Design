package com.XX.LLD.PRACTICE.DesignCabBooking.Strategy;

import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Location;

public class DefaultPricingStrategy implements PricingStrategy{

    private final Double PER_KM_RATE = 10.0;

    /**
     *
     * @return type {@DOUBLE}
     */
    public Double getPER_KM_RATE() {
        return PER_KM_RATE;
    }

    /**
     *
     * @param fromPoint      from which point [ Location -> coordinate ] to start
     * @param toPoint       to which point [ Location -> coordinate ] to end
     * @return  type {@DOUBLE}
     */
    @Override
    public Double findPrice(Location fromPoint, Location toPoint) {
        return fromPoint.distance(toPoint) * PER_KM_RATE;
    }
}
