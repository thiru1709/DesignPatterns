package DesignPatterns.BehaviouralDesignPattern.CommandPattern;

public class FanOnCommand implements Command{

    private Fan fan;

    public FanOnCommand(Fan fan){
        this.fan = fan;
    }

    public void execute(){
        fan.onFan();
    }
}
