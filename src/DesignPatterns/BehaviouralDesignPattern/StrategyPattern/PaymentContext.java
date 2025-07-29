package DesignPatterns.BehaviouralDesignPattern.StrategyPattern;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(int amount){
        System.out.println("Executing payment of " + amount);
        paymentStrategy.pay(amount);
    }
}
