package com.A.SOLID.S.SingleResponsibilityPrinciple.OneReasonToChange.Invoice;

import com.A.SOLID.S.SingleResponsibilityPrinciple.OneReasonToChange.Invoice.Invoice;

public class InvoiceDAO {
    Invoice invoice;

//    CONSTRUCTOR
    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

//    Method
    public void saveToDB(){
//        BUSINESS LOGIC
        System.out.println("Invoice Saved To DB");
    }
}
