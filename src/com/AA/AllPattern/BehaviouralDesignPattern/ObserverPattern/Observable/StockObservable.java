package com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observable;

import com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscriber();

    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
