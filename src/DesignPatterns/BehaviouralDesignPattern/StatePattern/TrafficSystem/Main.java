package DesignPatterns.BehaviouralDesignPattern.StatePattern.TrafficSystem;

public class Main {

    public static void main(String[] args) {
           TrafficLightContext trafficLightContext = new TrafficLightContext();
        for(int i = 0; i< 5; i++){
            trafficLightContext.changeLight();
        }
    }
}
