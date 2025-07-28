package DesignPatterns.StructuralDesignPatterns.FacadePattern;

public class HometheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HometheaterFacade(DVDPlayer dvdPlayer,Projector projector,SoundSystem soundSystem){
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie");
        projector.on();
        soundSystem.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting down home theater");
        dvdPlayer.stop();
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
    }
}
