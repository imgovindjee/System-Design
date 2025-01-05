package com.A.SOLID.S.SingleResponsibilityPrinciple.OneReasonToChange.Invoice;

import com.A.SOLID.S.SingleResponsibilityPrinciple.OneReasonToChange.Marker;

public class InvoiceMakerTotal {
    private Marker marker;
    private int quality;

    public InvoiceMakerTotal(Marker marker, int quality) {
        this.marker = marker;
        this.quality = quality;
    }

    public int calculateTotal() {
        return ((marker.getPrice()) * this.quality);
    }
}
