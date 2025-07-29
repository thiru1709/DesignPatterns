package DesignPatterns.BehaviouralDesignPattern.StatePattern.Ecommerce;

public class OrderShippedState implements OrderState{
    @Override
    public void next(OrderContext orderContext) {
        System.out.println("Order shipped");
        orderContext.setState(new OrderDeliveredState());
    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Cannot cancel order as order has been shipped");

    }
}
