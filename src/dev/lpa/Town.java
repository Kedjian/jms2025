package dev.lpa;

public class Town {
    String townName;
    int distanceFromStart;

    public Town(String townName, int distanceFromStart) {
        this.townName = townName;
        this.distanceFromStart = distanceFromStart;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public int getDistanceFromStart() {
        return distanceFromStart;
    }

    public void setDistanceFromStart(int distanceFromStart) {
        this.distanceFromStart = distanceFromStart;
    }
}
