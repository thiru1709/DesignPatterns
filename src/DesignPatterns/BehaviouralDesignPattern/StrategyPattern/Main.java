package DesignPatterns.BehaviouralDesignPattern.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPaymentStrategy("12345343"));
        paymentContext.executePayment(2000);

        PaymentContext paymentContext1 = new PaymentContext(new PayPalPaymentStrategy("sfaf@gmail.com"));
        paymentContext1.executePayment(3000);
    }
}
