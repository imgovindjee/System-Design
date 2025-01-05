package com.B.ObserverDesignPattern.Observable;

import com.B.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscriber();

    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
