package DesignPatterns.BehaviouralDesignPattern.StatePattern.Ecommerce;

public class Main {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        orderContext.proceedToNext();
        orderContext.proceedToNext();
        orderContext.cancel();
    }
}
