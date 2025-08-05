package DesignPatterns.BehaviouralDesignPattern.CommandPattern;

public class LightsOffCommand implements Command{

    private final Light light;

    public LightsOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
