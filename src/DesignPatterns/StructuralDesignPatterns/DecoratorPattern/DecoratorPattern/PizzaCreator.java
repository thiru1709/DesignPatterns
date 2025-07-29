package DesignPatterns.StructuralDesignPatterns.DecoratorPattern.DecoratorPattern;

import DesignPatterns.StructuralDesignPatterns.DecoratorPattern.DecoratorPattern.Decorator.ExtraCheese;
import DesignPatterns.StructuralDesignPatterns.DecoratorPattern.DecoratorPattern.Pizza.BasePizza;
import DesignPatterns.StructuralDesignPatterns.DecoratorPattern.DecoratorPattern.Pizza.Margarita;

public class PizzaCreator {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Margarita());
        System.out.println("Your total cost for the pizza is : "+ pizza.cost());

    }
}
