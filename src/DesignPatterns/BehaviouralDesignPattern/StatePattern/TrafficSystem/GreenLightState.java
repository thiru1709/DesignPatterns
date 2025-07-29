package DesignPatterns.BehaviouralDesignPattern.StatePattern.TrafficSystem;

public class GreenLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext trafficLightContext) {
        System.out.println("Green Light : Cars can go now ");
        trafficLightContext.setState(new RedLightState());
    }
}
