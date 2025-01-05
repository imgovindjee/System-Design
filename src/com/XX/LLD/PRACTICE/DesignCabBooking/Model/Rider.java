package com.XX.LLD.PRACTICE.DesignCabBooking.Model;

public class Rider {

    private String riderID;
    private String riderName;

    /**
     * {@AllArgsConstructor}
     *
     * @param riderID  unique rider ID
     * @param riderName  rider Name
     */
    public Rider(String riderID, String riderName) {
        this.riderID = riderID;
        this.riderName = riderName;
    }

    /**
     * GET RIDER-ID
     *
     * @return type {@String}
     */
    public String getRiderID() {
        return riderID;
    }

    /**
     * GET RIDER-NAME
     *
     * @return type {@String}
     */
    public String getRiderName() {
        return riderName;
    }
}
