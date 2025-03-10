package com.B.ObserverDesignPattern;

import com.B.ObserverDesignPattern.Observable.IphoneStockObservable;
import com.B.ObserverDesignPattern.Observable.StockObservable;
import com.B.ObserverDesignPattern.Observer.EmailAlertObserver;
import com.B.ObserverDesignPattern.Observer.MobileAlertObserver;
import com.B.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args){
//        OBSERVABLE
        StockObservable iphoneStockObservable = new IphoneStockObservable();
//        OBSERVER
        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("qwerty@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("POIUYTREWQ", iphoneStockObservable);


//        METHOD INVOKE
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
