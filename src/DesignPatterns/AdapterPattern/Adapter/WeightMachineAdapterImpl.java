package DesignPatterns.AdapterPattern.Adapter;

import DesignPatterns.AdapterPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public double weightInKgs() {
        return weightMachine.weightInPounds() * 0.45;
    }
}
