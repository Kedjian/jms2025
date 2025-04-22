package dev.lpa;

interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    /// public final double MILES_TO_KIM = 1.60934;
    /// public static final double MILES_TO_KIM = 1.60934;
    /// they're all the same
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
