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
    private DishWasher getDishWasher() { return dishWasher; }
    private Refrigerator getIceBox() { return iceBox; }

    public void brewCoffee() {
        getBrewMaster().brewCoffee();
    }
    public void doDishes() {getDishWasher().doDishes();}
    public void orderFood() {getIceBox().orderFood();}

    public boolean addWater() {
        return getBrewMaster().hasWorkToDo = true;
    }

    public boolean pourMilk() {
        return getIceBox().hasWorkToDo = true;
    }

    public boolean loadDishwasher() {
        return getDishWasher().hasWorkToDo = true;
    }

    public void setKitchenState(boolean brewMasterState, boolean dishWasherState, boolean iceBoxState) {
        getBrewMaster().hasWorkToDo = brewMasterState;
        getDishWasher().hasWorkToDo = dishWasherState;
        getIceBox().hasWorkToDo = iceBoxState;
    }

    public void doKitchenWork() {
        if (getBrewMaster().hasWorkToDo) {
            brewCoffee();
        }
        if (getDishWasher().hasWorkToDo) {
            doDishes();
        }
        if (getIceBox().hasWorkToDo) {
            orderFood();
        }
    }
}

class Refrigerator extends SmartKitchen {
    protected boolean hasWorkToDo = false;

    public Refrigerator() {}

    public void orderFood() {
        System.out.println("Food ordered.");
    }
}

class DishWasher extends SmartKitchen {
    protected boolean hasWorkToDo = false;

    public DishWasher() {}

    public void doDishes() {
        System.out.println("Dishes done.");
    }
}

class CoffeeMaker extends SmartKitchen {
    protected boolean hasWorkToDo = false;

    public CoffeeMaker() {}

    public void brewCoffee() {
        System.out.println("Coffee brewed.");
    }
}
