package DesignPatterns.BehaviouralDesignPattern.VisitorPattern;

public class Main {

    public static void main(String[] args) {
        ItemElement[] itemElements = new ItemElement[]{
                new Book("Design Patterns",300.00),
                new Fruit("Strawberry",3.00,120.00)
        };
        Visitor visitor = new StoreVisitor();

        for(ItemElement itemElement : itemElements){
            itemElement.accept(visitor);
        }
    }
}
