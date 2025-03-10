package com.A.SOLID.S.SingleResponsibilityPrinciple.OneReasonToChange.Invoice;

public class InvoicePrinter {
    private Invoice invoice;

//    CONSTRUCTOR
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
//        BUSINESS LOGIC
        System.out.println("Invoice Printed.");
    }
}
