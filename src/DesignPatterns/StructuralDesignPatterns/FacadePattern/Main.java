package DesignPatterns.StructuralDesignPatterns.FacadePattern;

public class Main {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        HometheaterFacade hometheaterFacade = new HometheaterFacade(dvdPlayer,projector,soundSystem);
        hometheaterFacade.watchMovie("Avatar");

        hometheaterFacade.endMovie();
    }
}
