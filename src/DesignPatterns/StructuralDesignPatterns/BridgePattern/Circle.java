package DesignPatterns.StructuralDesignPatterns.BridgePattern;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with");
        color.applyColor();
    }
}
