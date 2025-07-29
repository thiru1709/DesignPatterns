package DesignPatterns.BehaviouralDesignPattern.TemplatePattern;

public abstract class Game {

    public final void play(){
        initialize();
        startplay();
        endplay();
    }

    abstract void initialize();
    abstract void startplay();
    abstract void endplay();
}
