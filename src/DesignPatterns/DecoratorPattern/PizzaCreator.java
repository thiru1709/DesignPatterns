package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.Decorator.ExtraCheese;
import DesignPatterns.DecoratorPattern.Pizza.BasePizza;
import DesignPatterns.DecoratorPattern.Pizza.Margarita;

public class PizzaCreator {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Margarita());
        System.out.println("Your total cost for the pizza is : "+ pizza.cost());

    }
}
