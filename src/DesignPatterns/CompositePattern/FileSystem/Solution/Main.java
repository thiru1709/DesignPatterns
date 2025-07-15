package DesignPatterns.CompositePattern.FileSystem.Solution;

public class Main {

    public static void main(String[] args) {

        Directory movieDirectory = new Directory("movies");

        FileSystem file = new File("Border");
        movieDirectory.add(file);



        Directory directory1 = new Directory("comedymovies");
        directory1.add(new File("hulchul"));

        movieDirectory.add(directory1);
        movieDirectory.ls();
    }
}
