package dev.lpa;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> products = new ArrayList<>();

    public static void main(String[] args) {
        products.add(new Soda("Coca Cola", 8.50,
                "The favorite drink of all diabetic people!"));
        products.add(new Chips("Lays", 12.50,
                "The next favorite thing of your typical" +
                        " obese friend!"));
        listProducts();
    }

    public static void listProducts() {
        for (var item : products) {
            System.out.println("-".repeat(65));
            item.showDetails();
        }
    }
}
