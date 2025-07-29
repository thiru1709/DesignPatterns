package DesignPatterns.BehaviouralDesignPattern.StrategyPattern;

public class PayPalPaymentStrategy implements PaymentStrategy{

    private String email;

    public PayPalPaymentStrategy(String email){
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Making payment using paypal : " + email + " for amount " + amount);

    }
}
