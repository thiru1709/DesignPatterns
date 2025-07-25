package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class StaticBlockInitializationSingleton {

    private static StaticBlockInitializationSingleton singleton;

    static {
        try {
            singleton = new StaticBlockInitializationSingleton();
        }catch (Exception e){
            System.out.println("Exception during singleton object creation");
        }

    }
    private StaticBlockInitializationSingleton(){

    }

    public static StaticBlockInitializationSingleton getSingletonObject(){
        return singleton;
    }
}
