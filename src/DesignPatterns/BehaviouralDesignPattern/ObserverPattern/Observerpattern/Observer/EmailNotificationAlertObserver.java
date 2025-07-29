package DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observer;

import DesignPatterns.BehaviouralDesignPattern.ObserverPattern.Observerpattern.Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{

    private String emailAddress;
    private StockObservable observable;

    public EmailNotificationAlertObserver(String emailAddress, StockObservable observable){
        this.emailAddress = emailAddress;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(emailAddress);

    }

    private void sendEmail(String emailAddress) {
        System.out.println("Email sent to : " + emailAddress);
    }
}
