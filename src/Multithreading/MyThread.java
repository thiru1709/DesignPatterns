package Multithreading;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running");
        for (int i = 1; i <= 500; i++) {
            System.out.println("Task1: " + i);
        }
    }
}
