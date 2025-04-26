package dev.lpa;

public class TruckInterface implements Trackable {
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " is being tracked.");
    }

    @Override
    public void stopTracking() {
        System.out.println(getClass().getSimpleName() + " is not being tracked anymore.");
    }
}
