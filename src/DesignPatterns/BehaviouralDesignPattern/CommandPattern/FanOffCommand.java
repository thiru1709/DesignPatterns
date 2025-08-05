package DesignPatterns.BehaviouralDesignPattern.CommandPattern;

public class FanOffCommand implements Command{

    private Fan fan;

    public FanOffCommand(Fan fan){
        this.fan = fan;
    }

    public void execute(){
        fan.offFan();
    }
}
