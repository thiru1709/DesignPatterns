package Multithreading.Synchronization;

public class SharedResource {

    private int count = 0;

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }


}
