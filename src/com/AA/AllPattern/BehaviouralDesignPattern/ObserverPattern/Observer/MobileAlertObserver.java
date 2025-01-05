package com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observer;

import com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String userName;
    StockObservable stockObservable;

//    CONSTRUCTOR
    public MobileAlertObserver(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "PRODUCT IS IN STOCK, HURRY UP!!!");
    }

    public void sendMessageOnMobile(String userName, String msg) {
        System.out.println("Message send to:- "+msg);
    }
}
