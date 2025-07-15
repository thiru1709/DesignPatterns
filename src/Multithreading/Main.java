package Multithreading;

public class Main {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        Runnable runnable1 = new RunnableThread();
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();

        try {
            thread1.join(10);
            thread.join(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Both threads have completed and Main thread resumes");
    }
}
