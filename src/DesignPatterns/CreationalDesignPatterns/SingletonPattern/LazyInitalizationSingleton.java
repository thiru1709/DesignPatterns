package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class LazyInitalizationSingleton {

    private static LazyInitalizationSingleton instance;

    private LazyInitalizationSingleton(){

    }

    public static LazyInitalizationSingleton getSingletonObject(){
        if(instance == null){
            instance = new LazyInitalizationSingleton();
        }
        return instance;
    }
}
