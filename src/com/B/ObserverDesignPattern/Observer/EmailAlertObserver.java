package com.B.ObserverDesignPattern.Observer;

import com.B.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    String emailID;
    StockObservable stockObservable;
    public EmailAlertObserver(String emailID, StockObservable stockObservable){
        this.emailID = emailID;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEMail(emailID, "Product is in Stock, HURRY UP!!!");
    }

    public void sendEMail(String emailID, String msg){
        System.out.println("Message send to :- " +emailID);

//        BUSINESS LOGIC
    }
}
