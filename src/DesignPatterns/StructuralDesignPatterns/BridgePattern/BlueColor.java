package DesignPatterns.StructuralDesignPatterns.BridgePattern;

public class BlueColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying Blue color");
    }
}
