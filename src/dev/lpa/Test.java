package dev.lpa;

public class Test {
    public static void main(String[] args) {
        JetInterface jettyJet = new JetInterface();
        jettyJet.transition(FlightStages.LAUNCH);

//        OrbitEarth.log("Testing" + new Satellite());
        orbit(new Satellite());
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier) {
        flier.takeOff();
        flier.fly();
        flier.land();
    }

    // An abstract class provides a common definition,
    // as a base class, that multiple derived classes can share

    // The interface decouples the "what" from the "how", and is used
    // to make different types behave in similar ways
}
