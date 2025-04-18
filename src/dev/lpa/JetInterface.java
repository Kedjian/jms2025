package dev.lpa;

public class JetInterface implements FlightEnabled, Trackable {
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " takes off.");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " lands.");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " flies.");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " is being tracked.");
    }

    @Override
    public void stopTracking() {
        System.out.println(getClass().getSimpleName() + " is not being tracked anymore.");
    }
}
