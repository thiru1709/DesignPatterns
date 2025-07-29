package DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observable;

import DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observer.NotificationAlertObserver;

public interface StockObservable {
//    List<NotificationAlertObserver> observerList = new ArrayList<>();
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyAllSubscribers();
    public void setStock(int newStock);
    public int getStock();
}
