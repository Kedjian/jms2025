package dev.lpa;

interface FlightEnabled {
    public abstract void takeOff();
    abstract void land();
    void fly();
}

interface Trackable {
    void track();
    void stopTracking();
}

public abstract class AnimalInterfaces {
    public abstract void move();
}
