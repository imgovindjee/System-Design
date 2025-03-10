package com.A.SOLID.S.SingleResponsibilityPrinciple.Problem;

import com.A.SOLID.S.SingleResponsibilityPrinciple.OneReasonToChange.Marker;

public class Invoice {
    private Marker marker;
    private int quality;

//    CLASS-1
    public Invoice(Marker marker, int quality) {
        this.marker = marker;
        this.quality = quality;
    }

    public int calculateTotal() {
        return ((marker.getPrice()) * this.quality);
    }

//    CLASS-2
    public void printInvoice(){
//        BUSINESS LOGIC
    }

//    CLASS-3
    public void saveToDB() {
//        BUSINESS LOGIC
    }
}
