package DesignPatterns.StructuralDesignPatterns.CompositePattern.FileSystem.Problem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> listOfFiles = new ArrayList<>();
        listOfFiles.add(new File("Border"));
        ArrayList<Object> listOfFiles1 = new ArrayList<>();
        listOfFiles1.add(new File("Hulchul"));
        listOfFiles.add(new Directory("comedy movies", listOfFiles1));
        Directory directory = new Directory("C-Drive", listOfFiles);
        directory.ls();

    }
}
