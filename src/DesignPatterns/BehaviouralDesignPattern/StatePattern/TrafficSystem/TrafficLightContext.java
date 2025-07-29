package DesignPatterns.BehaviouralDesignPattern.StatePattern.TrafficSystem;

public class TrafficLightContext {

    public TrafficLightState trafficLightState;

    public TrafficLightContext(){
        trafficLightState = new RedLightState();
    }

    public void setState(TrafficLightState trafficLightState){
        this.trafficLightState = trafficLightState;
    }

    public void changeLight(){
        this.trafficLightState.handleRequest(this);
    }
}
