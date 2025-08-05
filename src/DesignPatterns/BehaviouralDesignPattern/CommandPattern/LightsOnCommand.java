package DesignPatterns.BehaviouralDesignPattern.CommandPattern;

public class LightsOnCommand implements Command{

    private final Light light;

    public LightsOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
