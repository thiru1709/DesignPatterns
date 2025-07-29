package DesignPatterns.BehaviouralDesignPattern.TemplatePattern;

public class FootBallGame extends Game {
    @Override
    void initialize() {
        System.out.println("Foot ball game initialized");
    }

    @Override
    void startplay() {
        System.out.println("Foot ball game started");

    }

    @Override
    void endplay() {
        System.out.println("Foot ball game ended");

    }
}
