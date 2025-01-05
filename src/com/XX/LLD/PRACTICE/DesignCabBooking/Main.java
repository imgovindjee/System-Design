package com.XX.LLD.PRACTICE.DesignCabBooking;

import com.XX.LLD.PRACTICE.DesignCabBooking.Controller.CabController;
import com.XX.LLD.PRACTICE.DesignCabBooking.Controller.RiderController;
import com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase.CabManager;
import com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase.RiderManager;
import com.XX.LLD.PRACTICE.DesignCabBooking.Manager.DataBase.TripManager;
import com.XX.LLD.PRACTICE.DesignCabBooking.Strategy.CabMatchingStrategy;
import com.XX.LLD.PRACTICE.DesignCabBooking.Strategy.DefaultCabMatchingStrategy;
import com.XX.LLD.PRACTICE.DesignCabBooking.Strategy.DefaultPricingStrategy;
import com.XX.LLD.PRACTICE.DesignCabBooking.Strategy.PricingStrategy;

public class Main {

    private CabController cabController;
    private RiderController riderController;

    /**
     * Setup run time
     */
    private void setUp(){
        CabManager cabManager = new CabManager();
        RiderManager riderManager = new RiderManager();

        CabMatchingStrategy cabMatchingStrategy = new DefaultCabMatchingStrategy();
        PricingStrategy pricingStrategy = new DefaultPricingStrategy();

        TripManager tripManager = new TripManager(cabManager, riderManager, cabMatchingStrategy, pricingStrategy);

        cabController = new CabController(cabManager, tripManager);
        riderController = new RiderController(riderManager, tripManager);
    }

    /**
     * {@param}  run type
     */
    private void testCabBooking(){
        String r1 = "r1";
        riderController.registerRider(r1, "ud");
        String r2 = "r2";
        riderController.registerRider(r2, "du");
        String r3 = "r3";
        riderController.registerRider(r3, "rider3");
        String r4 = "r4";
        riderController.registerRider(r4, "rider4");

        String c1 = "c1";
        cabController.registerCab(c1, "driver1");
        String c2 = "c2";
        cabController.registerCab(c2, "driver2");
        String c3 = "c3";
        cabController.registerCab(c3, "driver3");
        String c4 = "c4";
        cabController.registerCab(c4, "driver4");
        String c5 = "c5";
        cabController.registerCab(c5, "driver5");

        cabController.updateCabLocation(c1, 1.0, 1.0);
        cabController.updateCabLocation(c2, 2.0, 2.0);
        cabController.updateCabLocation(c3, 100.0, 100.0);
        cabController.updateCabLocation(c4, 13.0, 110.0);
        cabController.updateCabLocation(c5, 4.0, 1.0);

        cabController.updateCabAvailability(c2, false);
        cabController.updateCabAvailability(c4, false);

        riderController.book(r1, 0.0, 0.0, 500.0, 500.0);
//        riderController.book(r2, 10.0, 100.0, 350.0, 350.0);
        System.out.println("------------------------------------------------------------------------------------------\n" +
                "Printing current trips for r1 and r2");
        System.out.println(riderController.fetchHistory(r1).size());
        System.out.println(riderController.fetchHistory(r2));
        System.out.println("------------------------------------------------------------------------------------------");

        cabController.updateCabLocation(c5, 50.0, 50.0);

        System.out.println("------------------------------------------------------------------------------------------\n" +
                "Printing current trips for r1 and r2\n");
        System.out.println(riderController.fetchHistory(r1));
        System.out.println(riderController.fetchHistory(r2));
        System.out.println("------------------------------------------------------------------------------------------");

        cabController.endTrip(c5);

        System.out.println("------------------------------------------------------------------------------------------\n" +
                "Printing current trips for r1 and r2\n");
        System.out.println(riderController.fetchHistory(r1));
        System.out.println(riderController.fetchHistory(r2));
        System.out.println("------------------------------------------------------------------------------------------");

        riderController.book(r3, 0.0, 0.0, 500.0, 500.0);
        riderController.book(r4, 48.9, 48.0, 450.0, 500.0);
        System.out.println("------------------------------------------------------------------------------------------\n" +
                "Printing current trips for r1, r2 and r4\n");
        System.out.println(riderController.fetchHistory(r1));
        System.out.println(riderController.fetchHistory(r2));
        System.out.println(riderController.fetchHistory(r4));
        System.out.println("------------------------------------------------------------------------------------------");
    }


    /**
     * DEFAULT THREAD IN JAVA
     *
     * @param args {@default} void run type
     */
    public static void main(String[] args){
        Main main = new Main();
        main.setUp();
        main.testCabBooking();
    }
}
