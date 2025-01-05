package com.B.ObserverDesignPattern.Observer;

import com.B.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    String userName;
    StockObservable stockObservable;
    public  MobileAlertObserver(String userName, StockObservable stockObservable){
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Product is in Stock, HURRY UP!!!");
    }

    public void sendMessageOnMobile(String userName, String msg) {
        System.out.println("Message Send to :- " +userName);
    }
}
