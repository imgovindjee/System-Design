package com.XX.LLD.PRACTICE.DesignCabBooking.Model;

public class Location {

    private Double xCoordinate;
    private Double yCoordinate;

    public Location(Double xCoordinate, Double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Double getxCoordinate() {
        return xCoordinate;
    }

    public Double getyCoordinate() {
        return yCoordinate;
    }

    @Override
    public String toString() {
        return "Location{" +
                "xCoordinate = " + xCoordinate +
                ", yCoordinate = " + yCoordinate +
                '}';
    }

    public Double distance(Location location){
        return Math.sqrt(
                Math.pow(this.xCoordinate - location.getxCoordinate(), 2) +
                Math.pow(this.yCoordinate - location.getyCoordinate(), 2)
        );
    }
}
