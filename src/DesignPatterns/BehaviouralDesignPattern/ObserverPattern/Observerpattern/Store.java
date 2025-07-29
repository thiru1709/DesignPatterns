package DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern;

import DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observable.IphoneObservable;
import DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observable.StockObservable;
import DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observer.EmailNotificationAlertObserver;
import DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observer.MobileNotificationAlertObserver;
import DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observer.NotificationAlertObserver;

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
