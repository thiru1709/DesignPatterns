package DesignPatterns.CreationalDesignPatterns.Prototype;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Shape("circle");
        Shape newCircle = (Shape) circle.clone();

        System.out.println(circle.getType());
        System.out.println(newCircle.getType());
    }
}
