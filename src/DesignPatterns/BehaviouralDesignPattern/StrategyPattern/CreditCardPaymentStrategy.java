package DesignPatterns.BehaviouralDesignPattern.StrategyPattern;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    private final String creditCardNumber;

    public CreditCardPaymentStrategy(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Making payment using credit card " + creditCardNumber + "for amount : "+ amount);

    }
}
