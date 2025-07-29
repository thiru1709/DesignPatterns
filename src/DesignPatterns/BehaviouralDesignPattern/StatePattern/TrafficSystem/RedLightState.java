package DesignPatterns.BehaviouralDesignPattern.StatePattern.TrafficSystem;

public class RedLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext trafficLightContext) {
        System.out.println("Red Light : Cars must stop");
        trafficLightContext.setState(new GreenLightState());

    }
}
