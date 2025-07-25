package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class MacCheckBox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Rendering Mac checkbox");
    }
}
