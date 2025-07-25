package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {

        WindowsFactory windowsFactory = new WindowsFactory();
        MacFactory macFactory = new MacFactory();
        Application application = new Application(windowsFactory);
        Application application1 = new Application(macFactory);
        application1.render();
        application.render();
    }
}
