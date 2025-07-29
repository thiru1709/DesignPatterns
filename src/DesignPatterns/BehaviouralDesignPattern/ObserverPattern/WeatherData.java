package DesignPatterns.BehaviouralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{
    private List<Observer> observerList = new ArrayList<>();

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);

    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList){
            o.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
