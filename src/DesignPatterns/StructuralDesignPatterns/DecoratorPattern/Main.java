package DesignPatterns.StructuralDesignPatterns.DecoratorPattern;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedBorderDecorator(circle);


        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with Red border");
        redCircle.draw();
    }
}
