package DesignPatterns.StructuralDesignPatterns.AdapterPattern.Client;

import DesignPatterns.StructuralDesignPatterns.AdapterPattern.Adaptee.WeightmachineForBabies;
import DesignPatterns.StructuralDesignPatterns.AdapterPattern.Adapter.WeightMachineAdapter;
import DesignPatterns.StructuralDesignPatterns.AdapterPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightmachineForBabies());
        System.out.println(weightMachineAdapter.weightInKgs());
    }
}
