package DesignPatterns.BehaviouralDesignPattern.StatePattern.Ecommerce;

public interface OrderState {

    void next(OrderContext orderContext);
    void cancel(OrderContext orderContext);

}
