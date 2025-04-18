package dev.lpa;

public class BirdInterface extends AnimalInterfaces implements FlightEnabled, Trackable {

    @Override
    public void move() {
        System.out.println("Flaps wings.");
    }

    @Override
    public void takeOff() {
        System.out.println("The bird takes off.");
    }

    @Override
    public void land() {
        System.out.println("The bird lands.");
    }

    @Override
    public void fly() {
        System.out.println("The bird flies.");
    }

    @Override
    public void track() {
        System.out.println("The bird is being tracked.");
    }

    @Override
    public void stopTracking() {
        System.out.println("The bird's location is now unknown.");
    }
}
