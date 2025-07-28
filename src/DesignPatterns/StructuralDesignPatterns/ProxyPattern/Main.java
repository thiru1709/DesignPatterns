package DesignPatterns.StructuralDesignPatterns.ProxyPattern;

public class Main {

    public static void main(String[] args) {
        RealImage realImage = new RealImage("Cat");
        System.out.println(realImage);
        realImage.display();

        RealImage realImage1 = new RealImage("Cat");
        System.out.println(realImage1);
        realImage.display();

        ProxyImage proxyImage = new ProxyImage("Cat");
        System.out.println(proxyImage);
        proxyImage.display();
    }
}
