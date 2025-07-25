package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class WindowsFactory implements UiFactory{


    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
