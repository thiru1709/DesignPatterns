package DesignPatterns.StructuralDesignPatterns.BridgePattern;

public class Main {

    public static void main(String[] args) {

        Color redColor = new RedColor();
        Color blueColor = new BlueColor();

        Shape circle = new Circle(blueColor);
        Shape rectangle = new Rectangle(blueColor);

        circle.draw();
        rectangle.draw();
    }
}
