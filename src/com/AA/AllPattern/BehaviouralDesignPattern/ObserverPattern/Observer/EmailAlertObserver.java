package com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observer;

import com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailID;
    StockObservable stockObservable;

    public EmailAlertObserver(String emailID, StockObservable stockObservable) {
        this.emailID = emailID;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailID, "PRODUCT IS IN STOCK, HURRY UP!!!");
    }

    public void sendEmail(String emailID, String msg) {
//        BUSINESS LOGIC
        System.out.println("Message send to: "+emailID+" and Message is: "+msg);
    }
}
