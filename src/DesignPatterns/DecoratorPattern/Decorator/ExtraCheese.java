package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    BasePizza pizza;
    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return this.pizza.cost()+10;
    }
}
