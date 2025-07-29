package DesignPatterns.BehaviouralDesignPattern.ObserverPattern;

public interface Observable {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
