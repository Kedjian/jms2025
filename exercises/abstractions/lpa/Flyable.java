package dev.lpa;

interface Flyable {
    String fly_obj();
}

class Spacecraft implements Flyable {

    String name;
    String model;

    public Spacecraft(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String fly_obj() {
        return getClass().getSimpleName() + " " + name + " " +
                model + " flies at the speed of light!";
    }
}

class Airplane implements Flyable {
    String name;
    String model;

    public Airplane(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String fly_obj() {
        return getClass().getSimpleName() + " " + name + " " +
                model + " flies at a normal pace!";
    }
}

class Helicopter implements Flyable {
    String name;
    String model;
    double inches;

    public Helicopter(String name, String model, double inches) {
        this.name = name;
        this.model = model;
        this.inches = inches;
    }

    @Override
    public String fly_obj() {
        return getClass().getSimpleName() + " " + name + " " +
                model + " flies at a decent pace. It has " +
                + (int) inches + " inches. That's crazy bro!";
    }
}