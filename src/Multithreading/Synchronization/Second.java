package Multithreading.Synchronization;

public class Second extends Thread{

    private First func;
    private String msg;

    Second(First func, String s){
        this.func = func;
        this.msg = s;
    }

    public void run(){
        synchronized (func) {
            func.display(msg);
        }
    }
}
