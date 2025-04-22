package dev.lpa;

enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }

    @Override
    public void stopTracking() {

    }
}

record DragonFly(String name, String type) implements  FlightEnabled {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {
    public void achieveOrbit() {
        System.out.println("The orbit is achieved.");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();
}

interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    /// public final double MILES_TO_KIM = 1.60934;
    /// public static final double MILES_TO_KIM = 1.60934;
    /// they're all the same
    public abstract void takeOff();
    abstract void land();
    void fly();

    default FlightStages transition(FlightStages stage) {
//        System.out.println("transition not implemented on "
//                + getClass().getName());
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }

}

interface Trackable {
    void track();
    void stopTracking();
}

public abstract class AnimalInterfaces {
    public abstract void move();
}
