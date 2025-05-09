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

    FlightStages stage = FlightStages.GROUNDED;

    public void achieveOrbit() {
        transition("Orbit achieved");
    }

    @Override
    public void takeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");

    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data collection while orbiting");

    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description) {
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning transition to " + nextStage);
        return nextStage;
    }
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
