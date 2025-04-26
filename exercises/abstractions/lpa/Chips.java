package dev.lpa;

public class Chips extends ProductForSale {

    public Chips(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.println(price);
        System.out.println(description);
    }
}
