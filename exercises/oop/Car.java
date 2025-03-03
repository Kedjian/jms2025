public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }
    public void startEngine() {
        System.out.println("Car -> engine started.");
    }
    public void accelerate() {
        System.out.println("Car -> accelerates.");
    }
    public void brake() {
        System.out.println("Car -> brakes.");
    }
    public int getCylinders() {
        return cylinders;
    }
    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    public void startEngine() {
        System.out.println("Mitsubishi -> engine started.");
    }
    public void accelerate() {
        System.out.println("Mitsubishi -> accelerates.");
    }
    public void brake() {
        System.out.println("Mitsubishi -> brakes.");
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    public void startEngine() {
        System.out.println("Holden -> engine started.");
    }
    public void accelerate() {
        System.out.println("Holden -> accelerates.");
    }
    public void brake() {
        System.out.println("Holden -> brakes.");
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    public void startEngine() {
        System.out.println("Ford -> engine started.");
    }
    public void accelerate() {
        System.out.println("Ford -> accelerates.");
    }
    public void brake() {
        System.out.println("Ford -> brakes.");
    }
}

