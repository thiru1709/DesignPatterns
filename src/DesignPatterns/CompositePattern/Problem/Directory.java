package DesignPatterns.CompositePattern.Problem;

import java.util.List;

public class Directory {

    private String name;
    private List<Object> listOfFiles;

    public Directory(String name, List<Object> listOfFiles){
        this.name = name;
        this.listOfFiles = listOfFiles;
    }

    public void ls(){
        System.out.println("Navigating through Directory : " + name);
        for(Object o : listOfFiles){
            if(o instanceof Directory){
                ((Directory) o).ls();
            }else if(o instanceof File){
                ((File) o).ls();
            }
        }
    }
}
