package DesignPatterns.BehaviouralDesignPattern.InterpreterPattern;

public class Main {

    public static void main(String[] args) {

        Expression ten = new Number(10);
        Expression twenty = new Number(20);
        Expression five = new Number(5);

        Expression addition = new Add(ten,twenty);
        Expression substraction = new Substract(addition, five);

        System.out.println("Result : " + substraction.interpret());


    }
}
