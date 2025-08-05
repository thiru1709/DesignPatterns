package DesignPatterns.BehaviouralDesignPattern.VisitorPattern;

public class Book implements ItemElement{

    private String title;
    private double price;

    public Book(String title,double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
