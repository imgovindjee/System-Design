package com.XX.LLD.PRACTICE.DesignOrderManagementSystem;

import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Order.Order;

public class Invoice {

    int totalItemPrice;
    int totalTax;
    int totalFinalPrice;

//    GENERATE INVOICE
    public void generateInvoice(Order order) {
//        BUSINESS LOGIC
        totalItemPrice = 2000;
        totalTax = 200;
        totalFinalPrice = 2200;
    }
}
