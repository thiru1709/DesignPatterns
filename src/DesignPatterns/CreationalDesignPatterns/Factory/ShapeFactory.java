package DesignPatterns.CreationalDesignPatterns.Factory;

public class ShapeFactory {

    public Shape getShape(String type){
        switch (type){
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
