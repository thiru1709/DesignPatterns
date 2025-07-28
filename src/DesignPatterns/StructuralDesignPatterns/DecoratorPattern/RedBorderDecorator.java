package DesignPatterns.StructuralDesignPatterns.DecoratorPattern;

public class RedBorderDecorator extends ShapeDecorator{

    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Setting Red Border");
    }
}
