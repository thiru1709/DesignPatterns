package DesignPatterns.BehaviouralDesignPattern.ObserverPattern;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();

        weatherData.registerObserver(currentConditionsDisplay);

        weatherData.setMeasurements(30.4f,65.0f,1013.1f);
        weatherData.setMeasurements(28.2f,60.0f,1013.1f);
    }
}
