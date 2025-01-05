package com.A.SOLID.O.OpenCloseProblem.Problem;

import com.A.SOLID.O.OpenCloseProblem.OpenForExtensionButCloseForModification.Invoice;

public class InvoiceDAO {
    Invoice invoice;

    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
//        BUSINESS LOGIC
    }

    public void saveToFile() {
//        BUSINESS LOGIC
    }
}
