package DesignPatterns.CompositePattern.FileSystem.Solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    private final List<FileSystem> fileSystemList = new ArrayList<>();
    private final String name;

    public Directory(String name){
        this.name = name;
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }
    @Override
    public void ls() {
        System.out.println("Directory name is " + name);
        for(FileSystem fileSystem : fileSystemList){
            fileSystem.ls();
        }

    }
}
