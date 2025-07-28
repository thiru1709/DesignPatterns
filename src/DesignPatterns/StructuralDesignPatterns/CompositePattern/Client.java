package DesignPatterns.StructuralDesignPatterns.CompositePattern;

public class Client {

    public static void main(String[] args) {

        File file1 = new File("Document1.txt");
        File file2 = new File("Photo1.jpg");
        File file3 = new File("Video.mp4");

        Folder folder1 = new Folder("My Documents");
        folder1.addComponent(file1);


        Folder folder2 = new Folder("Media");
        folder2.addComponent(file2);
        folder2.addComponent(file3);

        Folder rootFolder = new Folder("Root");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        rootFolder.showDetails();


    }
}
