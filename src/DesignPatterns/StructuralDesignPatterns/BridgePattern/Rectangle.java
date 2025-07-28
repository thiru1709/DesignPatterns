package DesignPatterns.StructuralDesignPatterns.BridgePattern;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectange with ");
        color.applyColor();

    }
}
