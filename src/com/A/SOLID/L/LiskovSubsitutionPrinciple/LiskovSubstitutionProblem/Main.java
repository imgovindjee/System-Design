package com.A.SOLID.L.LiskovSubsitutionPrinciple.LiskovSubstitutionProblem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { // Throws NULL_POINTER_EXCEPTION (NPE)
        List<vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new car());
        vehicleList.add(new motorCycle());
        vehicleList.add(new bicycle());

        for(vehicle vl : vehicleList) {
            System.out.println(vl.hasEngine().toString());
        }
    }
}
