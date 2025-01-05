package com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase;

import com.XX.LLD.PRACTICE.DesignCabBooking.Exceptions.NoCabsAvailableException;
import com.XX.LLD.PRACTICE.DesignCabBooking.Exceptions.TripNotFoundException;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Cab;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Location;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Rider;
import com.XX.LLD.PRACTICE.DesignCabBooking.Model.Trip;
import com.XX.LLD.PRACTICE.DesignCabBooking.Strategy.CabMatchingStrategy;
import com.XX.LLD.PRACTICE.DesignCabBooking.Strategy.PricingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TripManager {

    private final Double MAX_ALLOWED_TRIP_MATCHING_DISTANCE = 10.0;

    private CabManager cabManager;
    private RiderManager riderManager;
    private CabMatchingStrategy cabMatchingStrategy;
    private PricingStrategy pricingStrategy;
    private Map<String, List<Trip>> trips = new HashMap<>();

    /**
     * {@AllArgsConstructor} CONSTRUCTOR
     *
     * @param cabManager
     * @param riderManager
     * @param cabMatchingStrategy
     * @param pricingStrategy
     */
    public TripManager(CabManager cabManager, RiderManager riderManager, CabMatchingStrategy cabMatchingStrategy, PricingStrategy pricingStrategy) {
        this.cabManager = cabManager;
        this.riderManager = riderManager;
        this.cabMatchingStrategy = cabMatchingStrategy;
        this.pricingStrategy = pricingStrategy;
    }

    /**
     * Create a TRIP
     *
     * @param rider Instance of Rider
     * @param fromPoint Location X-Coordinate of starting
     * @param toPoint Location Y-Coordinate of starting
     */
    public void createTrip(Rider rider, Location fromPoint, Location toPoint){
        List<Cab> closeByCabs = cabManager.getAllCabs(fromPoint, MAX_ALLOWED_TRIP_MATCHING_DISTANCE);
        List<Cab> closeByAvailableCabs = closeByCabs.stream()
                .filter(cab -> cab.getCurrentTrip() == null)
                .collect(Collectors.toList());

        Cab selectedCab = cabMatchingStrategy.matchCabToRider(rider, closeByAvailableCabs, fromPoint, toPoint);
        if (selectedCab == null){
            throw new NoCabsAvailableException();
        }

        Double price = pricingStrategy.findPrice(fromPoint, toPoint);
        Trip newTrip = new Trip(rider, selectedCab, price, fromPoint, toPoint);
        if (!trips.containsKey(rider.getRiderID())){
            trips.put(rider.getRiderID(), new ArrayList<>());
        }
        trips.get(rider.getRiderID()).add(newTrip);
        selectedCab.setCurrentTrip(newTrip);
    }

    /**
     *
     * @param rider INSTANCE OF RIDER
     * @return type {@list} of {@Trip}
     */
    public List<Trip> tripHistory(Rider rider){
        return trips.get(rider.getRiderID());
    }

    /**
     * END'S THE TRIP
     *
     * @param cab instance of {@Cab}
     */
    public void endTrip(Cab cab){
        if(cab.getCurrentTrip() == null){
            throw new TripNotFoundException();
        }

        cab.getCurrentTrip().endTrip();
        cab.setCurrentTrip(null);
        System.out.println("Your Trip with cab having ID: "+cab.getCarID()+" ended...");
    }
}
