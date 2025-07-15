package DesignPatterns.CompositePattern.Calculator;

public class Main {

    public static void main(String[] args) {

        Expression two = new Number(2);

        Expression one = new Number(1);
        Expression seven = new Number(7);

        Expression addExpression = new ArithmeticExpression(one,seven,Operator.ADD);
        Expression multplyExpression = new ArithmeticExpression(two, addExpression, Operator.MULTIPLY);

        System.out.println(multplyExpression.evaluate());
//        multplyExpression.evaluate();

    }
}
