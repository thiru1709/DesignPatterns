package DesignPatterns.BehaviouralDesignPattern.VisitorPattern;

public interface Visitor {

    void visit(Book book);

    void visit(Fruit fruit);
}
