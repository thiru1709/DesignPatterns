package DesignPatterns.BehaviouralDesignPattern.TemplatePattern;

public class Main {
    public static void main(String[] args) {
        CricketGame cricketGame = new CricketGame();
        cricketGame.play();

        FootBallGame footBallGame = new FootBallGame();
        footBallGame.play();
    }


}
