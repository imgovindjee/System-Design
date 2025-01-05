package com.XX.LLD.PRACTICE.DesignCabBooking.Model;

public class Cab {

    private String carID;
    private String driverName;
    private Trip currentTrip;
    private Location currentLocation;
    private boolean isAvailable;

    /**
     * {@AllArgsConstructor} CONSTRUCTOR
     *
     * @param carID unique Car-ID
     * @param driverName  driver Name
     */
    public Cab(String carID, String driverName) {
        this.carID = carID;
        this.driverName = driverName;
        this.isAvailable = true;
    }

//    ALL GETTER AND SETTER
    public void setCurrentTrip(Trip currentTrip) {
        this.currentTrip = currentTrip;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getCarID() {
        return carID;
    }

    public String getDriverName() {
        return driverName;
    }

    public Trip getCurrentTrip() {
        return currentTrip;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     *
     * @return type {@String}
     */
    @Override
    public String toString() {
        return "Cab{" +
                "carID = '" + carID + '\'' +
                ", driverName = '" + driverName + '\'' +
                ", currentTrip = " + currentTrip +
                ", currentLocation = " + currentLocation +
                ", isAvailable = " + isAvailable +
                '}';
    }
}
