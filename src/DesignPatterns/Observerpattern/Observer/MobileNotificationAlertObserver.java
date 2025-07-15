package DesignPatterns.Observerpattern.Observer;

import DesignPatterns.Observerpattern.Observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver{

    private String receiverMobile;
    private StockObservable observable;

    public MobileNotificationAlertObserver(String receiverMobile, StockObservable observable){
        this.receiverMobile = receiverMobile;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendSms(receiverMobile);
    }

    private void sendSms(String receiverMobile) {
        System.out.println("SMS sent to : " + receiverMobile );
    }
}
