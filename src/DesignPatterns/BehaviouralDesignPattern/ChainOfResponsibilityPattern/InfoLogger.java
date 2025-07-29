package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibilityPattern;

public class InfoLogger extends Logger{
public InfoLogger(){
    this.level = 1;
}

    @Override
    public void write(String message) {
        System.out.println("INFO : " + message);
    }
}
