package DesignPatterns.StructuralDesignPatterns.BridgePattern;

public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying Red color");
    }
}
