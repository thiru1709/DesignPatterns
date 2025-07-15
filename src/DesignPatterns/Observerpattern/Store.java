package DesignPatterns.Observerpattern;

import DesignPatterns.Observerpattern.Observable.IphoneObservable;
import DesignPatterns.Observerpattern.Observable.StockObservable;
import DesignPatterns.Observerpattern.Observer.EmailNotificationAlertObserver;
import DesignPatterns.Observerpattern.Observer.MobileNotificationAlertObserver;
import DesignPatterns.Observerpattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StockObservable iphoneObservable = new IphoneObservable();
        NotificationAlertObserver observer1 = new MobileNotificationAlertObserver("xyz",iphoneObservable);
        NotificationAlertObserver observer2 = new EmailNotificationAlertObserver("xyz@gmail.com",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setStock(10);
    }
}
