import java.sql.Ref;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {}
    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    private CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public void brewCoffee() {
        getBrewMaster().brewCoffee();
    }
}

class Refrigerator extends SmartKitchen {
    private boolean hasWorkToDo;

    public Refrigerator() {}

    public void orderFood() {
        System.out.println("Food ordered.");
    }
}

class DishWasher extends SmartKitchen {
    private boolean hasWorkToDo;

    public DishWasher() {}

    public void doDishes() {
        System.out.println("Dishes done.");
    }
}

class CoffeeMaker extends SmartKitchen {
    private boolean hasWorkToDo;

    public CoffeeMaker() {}

    public void brewCoffee() {
        System.out.println("Coffee brewed.");
    }
}
