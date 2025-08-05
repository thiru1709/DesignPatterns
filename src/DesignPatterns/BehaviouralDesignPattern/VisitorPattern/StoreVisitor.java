package DesignPatterns.BehaviouralDesignPattern.VisitorPattern;

public class StoreVisitor implements Visitor{
    @Override
    public void visit(Book book) {
        System.out.println("Book : " + book.getTitle() + ", Price : " + book.getPrice());
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("Fruit : " + fruit.getName() + ", Weight : " + fruit.getWeight() + ", Price : " + fruit.getPrice());

    }
}
