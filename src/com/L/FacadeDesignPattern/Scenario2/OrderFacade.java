package com.L.FacadeDesignPattern.Scenario2;

import com.L.FacadeDesignPattern.Scenario2.ComplexSystem.*;

public class OrderFacade {
    ProductDAO productDAO;
    Invoice invoice;
    Payment payment;
    SendNotifications sendNotifications;

    public OrderFacade(){
        productDAO = new ProductDAO();
        invoice = new Invoice();
        payment = new Payment();
        sendNotifications = new SendNotifications();
    }

    public void createOrder(){
        Product product = productDAO.getProduct(121);
        payment.makePayment();
        invoice.generateInvoice();
        sendNotifications.sendNotification("Product Sailed Successfully");
    }
}
