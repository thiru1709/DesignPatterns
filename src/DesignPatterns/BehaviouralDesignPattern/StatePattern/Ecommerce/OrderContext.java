package DesignPatterns.BehaviouralDesignPattern.StatePattern.Ecommerce;

public class OrderContext {

    private OrderState currentState;

    public OrderContext(){
        currentState = new OrderPlacedState();

    }

    public void setState(OrderState orderState){
        this.currentState = orderState;
    }

    public void proceedToNext(){
        currentState.next(this);
    }

    public void cancel(){
        currentState.cancel(this);
    }
}
