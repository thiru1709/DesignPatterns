package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class ThreadSafeInitializationSingleton {

    private static ThreadSafeInitializationSingleton instance;

    private ThreadSafeInitializationSingleton(){
        System.out.println("Instance created");

    }

    public static ThreadSafeInitializationSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeInitializationSingleton();
        }
        return instance;
    }


}
