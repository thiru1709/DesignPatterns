package DesignPatterns.BehaviouralDesignPattern.StatePattern.Ecommerce;

public class OrderDeliveredState implements OrderState{
    @Override
    public void next(OrderContext orderContext) {
        System.out.println("Order has been delivered");

    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Order has been delivered , so cannot cancel");

    }
}
