package DesignPatterns.StructuralDesignPatterns.AdapterPattern.Adaptee;

public class WeightmachineForBabies implements WeightMachine{

    @Override
    public double weightInPounds() {
        return 28;
    }
}
