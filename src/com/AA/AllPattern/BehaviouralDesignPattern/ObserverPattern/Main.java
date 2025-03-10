package com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern;

import com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observable.IphoneStockObservable;
import com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observable.StockObservable;
import com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observer.EmailAlertObserver;
import com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observer.MobileAlertObserver;
import com.AA.AllPattern.BehaviouralDesignPattern.ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
//        OBSERVABLE
        StockObservable iphoneStockObservable = new IphoneStockObservable();
//        OBSERVER
        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("qwerty@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("PRIYANKA", iphoneStockObservable);

//        METHOD INVOKE
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
