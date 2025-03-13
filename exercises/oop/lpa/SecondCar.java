public class SecondCar {
    private String description;

    public SecondCar() {}
    public SecondCar(String description) {}

    public void startEngine() {
        System.out.println("Second Car engine started!");
    }
    public void drive() {
        System.out.println("Car is driving! Type is: " + getClass().getSimpleName());
    }
    protected void runEngine() {
        System.out.println("Second Car engine is running!");
    }
}

class GasPoweredCar extends SecondCar {
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super();
    }
    public GasPoweredCar(String description) {}

    public void startEngine() {
        System.out.println("Gas Powered Car engine started!");
    }
    public void runEngine() {
        System.out.println("Gas Powered Car engine is running!");
    }
}

class ElectricCar extends SecondCar {
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super();
    }
    public ElectricCar(String description) {}

    public void startEngine() {
        System.out.println("Electric Car engine started!");
    }
    public void runEngine() {
        System.out.println("Electric Car engine is running!");
    }
}

class HybridCar extends SecondCar {
    private double avgKmPerLitre;
    private int batteryHybridSize;
    private int cylinders;
    public HybridCar(String avgKmPerLitre, int batteryHybridSize, int cylinders) {
        super();
    }
    public HybridCar(String description) {
        super(description);
    }
    public void startEngine() {
        System.out.println("Hybrid Car engine started!");
    }
    public void runEngine() {
        System.out.println("Hybrid Car engine is running!");
    }
}
