package DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observable;

import DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stock = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);

    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyAllSubscribers() {
        for(NotificationAlertObserver obj : observerList){
            obj.update();
        }

    }

    @Override
    public void setStock(int newStock) {
        if(stock == 0){
            notifyAllSubscribers();
        }
        stock = stock + newStock;

    }

    @Override
    public int getStock() {
        return stock;
    }
}
