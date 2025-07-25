package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class Application {
    private Button button;
    private Checkbox checkbox;


    public Application(UiFactory uiFactory){
        this.button = uiFactory.createButton();
        this.checkbox = uiFactory.createCheckBox();

    }

    public void render(){
        this.button.render();
        this.checkbox.render();
    }
}
