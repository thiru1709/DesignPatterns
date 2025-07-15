package DesignPatterns.StrategyPattern.NoPattern;

public class Journey {

    public static void main(String[] args) {
        Vehicle car = new PassengerVehicle();
        Vehicle sportscar = new SportsVehicle();
        Vehicle thunder = new OffRoadVehicle();

        car.drive();
        sportscar.drive();
        thunder.drive();

    }
}
