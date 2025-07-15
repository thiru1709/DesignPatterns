package Multithreading;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable thread is starting...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task2: " + i);
        }
    }
}
