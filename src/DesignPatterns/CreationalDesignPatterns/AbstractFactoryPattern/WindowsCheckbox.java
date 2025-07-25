package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Rendering windows checkbox");
    }
}
