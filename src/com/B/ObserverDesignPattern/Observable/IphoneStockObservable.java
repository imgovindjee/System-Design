package com.B.ObserverDesignPattern.Observable;

import com.B.ObserverDesignPattern.Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;


public class IphoneStockObservable implements StockObservable {
    List<NotificationAlertObserver> list = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        list.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        list.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver l : list){
            l.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0) {
            notifySubscriber();
        } else {
            stockCount += newStockAdded;
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
