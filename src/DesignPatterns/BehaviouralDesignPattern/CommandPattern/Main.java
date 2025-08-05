package DesignPatterns.BehaviouralDesignPattern.CommandPattern;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();


        Command lightsOnCommand = new LightsOnCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightsOnCommand);
        remoteControl.pressButton();
    }
}
