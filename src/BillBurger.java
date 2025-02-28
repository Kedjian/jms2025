public class BillBurger {
    private String burger;
    private String drink;
    private String sideItem;

    public BillBurger() {
        this.burger = "Regular burger.";
        this.drink = "Regular drink.";
        this.sideItem = "Regular side item.";
    }

    public BillBurger(String burger, String drink, String sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    @Override
    public String toString() {
        return "BillBurger{" +
                "burger='" + burger + '\'' +
                ", drink='" + drink + '\'' +
                ", sideItem='" + sideItem + '\'' +
                '}';
    }
}

class Burger extends BillBurger {
    private String burgerType;
    private double basePrice;

    public Burger(String burgerType, double basePrice) {
        this.burgerType = burgerType;
        this.basePrice = basePrice;
    }
}

class DeluxeBurger extends BillBurger {
    private final double price = 20.5;
}

class Drink extends BillBurger {
    private String type;
    private String size;
    private double price;
}

class SideItem extends BillBurger {
    private String type;
    private double price;
}