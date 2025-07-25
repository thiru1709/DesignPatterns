package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton singleton = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){

    }

    public static EagerInitializationSingleton getSingletonObject(){
        return singleton;
    }
}
