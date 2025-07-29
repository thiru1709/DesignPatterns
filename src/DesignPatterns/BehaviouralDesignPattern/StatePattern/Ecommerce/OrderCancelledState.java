package DesignPatterns.BehaviouralDesignPattern.StatePattern.Ecommerce;

public class OrderCancelledState implements OrderState{
    @Override
    public void next(OrderContext orderContext) {
        System.out.println("cannot proceed as order has been cancelled");

    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Order has been already cancelled");

    }
}
