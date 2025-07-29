package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibilityPattern;

public abstract class Logger {

    protected int level;
    protected Logger nextLogger;

    public void setNextLogger(Logger logger){
        this.nextLogger = logger;
    }

    public void logMessage(int level,String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }

    }

    public abstract void write(String message);
}
