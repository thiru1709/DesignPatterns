package DesignPatterns.BehaviouralDesignPattern.TemplatePattern;

public class CricketGame extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket Game initialized. Start playing ");
    }

    @Override
    void startplay() {
        System.out.println("Cricket Game started. Enjoy !");

    }

    @Override
    void endplay() {
        System.out.println("Cricket Game ended");

    }
}
