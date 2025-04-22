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
}
