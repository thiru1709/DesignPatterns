package Multithreading.Synchronization;

public class First {

    public void display(String msg){
        System.out.print("[ " + msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print(" ]");
    }
}
