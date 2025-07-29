package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibilityPattern;

public class ErrorLogger extends Logger{

    public ErrorLogger(){
        this.level = 3;
    }
    @Override
    public void write(String message) {
        System.out.println("ERROR : " + message);
    }
}
