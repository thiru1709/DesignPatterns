package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibilityPattern;

public class DebugLogger extends Logger{

    public DebugLogger(){
        this.level = 2;
    }
    @Override
    public void write(String message) {
        System.out.println("DEBUG : " + message);
    }
}
