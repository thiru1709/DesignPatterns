package DesignPatterns.BehaviouralDesignPattern.VisitorPattern;

public class Fruit implements ItemElement{

    private final String name;
    private final double weight;
    private final double price;

    public Fruit(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
