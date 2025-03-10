package com.A.SOLID.L.LiskovSubsitutionPrinciple.LiskovSubstitutionProblem;

public class car extends vehicle {

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
