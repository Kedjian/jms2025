public class SecondCar {
    private String description;

    public static SecondCar getSecondCar(String type, String description) {
        return switch(type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description);
            case 'E' -> new ElectricCar(description);
            case 'H' -> new HybridCar(description);
            default -> new SecondCar();
        };
    }

    public void startEngine() {
        System.out.println("Second Car engine started!");
    }
    public void drive() {
        System.out.println("Second Car is driving!");
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
        super.startEngine();
        System.out.println("Gas Powered Car engine started!");
    }
    public void drive() {
        super.drive();
        System.out.println("Gas Powered Car is driving!");
    }
    public void runEngine() {
        super.runEngine();
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
        super.startEngine();
        System.out.println("Electric Car engine started!");
    }
    public void drive() {
        super.drive();
        System.out.println("Electric Car is driving!");
    }
    public void runEngine() {
        super.runEngine();
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
    public HybridCar(String description) {}
    public void startEngine() {
        super.startEngine();
        System.out.println("Hybrid Car engine started!");
    }
    public void drive() {
        super.drive();
        System.out.println("Hybrid Car is driving!");
    }
    public void runEngine() {
        super.runEngine();
        System.out.println("Hybrid Car engine is running!");
    }
}
