package DesignPatterns.AdapterPattern.Client;

import DesignPatterns.AdapterPattern.Adaptee.WeightmachineForBabies;
import DesignPatterns.AdapterPattern.Adapter.WeightMachineAdapter;
import DesignPatterns.AdapterPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightmachineForBabies());
        System.out.println(weightMachineAdapter.weightInKgs());
    }
}
