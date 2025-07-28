package DesignPatterns.StructuralDesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name){
        this.name = name;

    }

    public void addComponent(FileSystemComponent fileSystemComponent){
        components.add(fileSystemComponent);
    }
    @Override
    public void showDetails() {
        System.out.println("Folder : " + name);
        for(FileSystemComponent fileSystemComponent : components){
            fileSystemComponent.showDetails();
        }

    }
}
