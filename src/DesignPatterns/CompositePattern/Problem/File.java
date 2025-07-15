package DesignPatterns.CompositePattern.Problem;

public class File {

    private final String name;

    public File(String name){
        this.name = name;
    }

    public void ls(){
        System.out.println("File name is : " + name);
    }
}
