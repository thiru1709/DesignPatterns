package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class MacFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckBox();
    }
}
