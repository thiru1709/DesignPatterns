package DesignPatterns.BehaviouralDesignPattern.StatePattern.Ecommerce;

public class OrderPlacedState implements OrderState{
    @Override
    public void next(OrderContext orderContext) {
        System.out.println("Order is placed");
        orderContext.setState(new OrderShippedState());
    }

    @Override
    public void cancel(OrderContext orderContext) {
        System.out.println("Cancelling order");
        orderContext.setState(new OrderCancelledState());

    }
}
