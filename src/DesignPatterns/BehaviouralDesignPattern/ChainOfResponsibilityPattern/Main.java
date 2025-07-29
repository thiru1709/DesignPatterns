package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibilityPattern;

public class Main {

    private static Logger loggerChain(){
        InfoLogger infoLogger = new InfoLogger();
        DebugLogger debugLogger = new DebugLogger();
        ErrorLogger errorLogger = new ErrorLogger();

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {

        Logger logger = loggerChain();
        logger.logMessage(3,"This is an info message");


    }
}
