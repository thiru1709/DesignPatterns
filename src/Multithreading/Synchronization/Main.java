package Multithreading.Synchronization;

public class Main {

    public static void main(String[] args) {
//        synchronizationExample();
        First first = new First();
//        first.display("Welcome");

        Second ss = new Second(first, "Welcome");
        Second ss1 = new Second(first, "new");
        Second ss2 = new Second(first, "programmer");

        ss.start();
        ss1.start();
        ss2.start();
    }

    private static void synchronizationExample() {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i<10 ; i++ ){
                resource.increment();
                System.out.println("T1 incremented " + resource.getCount());
            }


        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i<10 ; i++ ){
                resource.increment();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T2 incremented " + resource.getCount());
            }


        });

        t1.start();

//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        t2.start();
        System.out.println("final resource count is " + resource.getCount());
        System.out.println("Execution of all the threads completed");
    }

}
