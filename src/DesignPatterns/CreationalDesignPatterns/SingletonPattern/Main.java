package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class Main {

    public static void main(String[] args) {

        //Eager Initialization
//        EagerInitializationSingleton eagerInitializationSingleton = EagerInitializationSingleton.getSingletonObject();
//        EagerInitializationSingleton singleton1 = EagerInitializationSingleton.getSingletonObject();
//        System.out.println("Object1 is " + eagerInitializationSingleton);
//        System.out.println("object2 is " + singleton1);

        //Static block initialization
//        StaticBlockInitializationSingleton singleton = StaticBlockInitializationSingleton.getSingletonObject();
//        StaticBlockInitializationSingleton singleton1 = StaticBlockInitializationSingleton.getSingletonObject();
//        System.out.println("Object1 is " + singleton);
//        System.out.println("object2 is " + singleton1);


        //Lazy initialization
//        LazyInitalizationSingleton singleton = LazyInitalizationSingleton.getSingletonObject();
//        LazyInitalizationSingleton singleton1 = LazyInitalizationSingleton.getSingletonObject();
//
//        System.out.println("Object1 is " + singleton);
//        System.out.println("object2 is " + singleton1);



        Thread thread1 = new Thread(() -> {
            ThreadSafeInitializationSingleton singleton = ThreadSafeInitializationSingleton.getInstance();
            System.out.println("Object 1 is " + singleton);
        });
        Thread thread2 = new Thread(() -> {
            ThreadSafeInitializationSingleton singleton1 = ThreadSafeInitializationSingleton.getInstance();
            System.out.println("Object 2 is " + singleton1);
        });
        thread1.start();
        thread2.start();



//        ThreadSafeInitializationSingleton singleton = ThreadSafeInitializationSingleton.getInstance();
//        ThreadSafeInitializationSingleton singleton1 = ThreadSafeInitializationSingleton.getInstance();
//        System.out.println("Object1 is " + singleton);
//        System.out.println("object2 is " + singleton1);



    }
}
