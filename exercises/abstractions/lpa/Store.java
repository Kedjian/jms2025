package dev.lpa;

import java.util.ArrayList;

record OrderItem(int quantity,ProductForSale product) {}

public class Store {

    private static ArrayList<ProductForSale> products = new ArrayList<>();

    public static void main(String[] args) {
        products.add(new Soda("Coca Cola", 8.50,
                "The favorite drink of all diabetic people!"));
        products.add(new Chips("Lays", 12.50,
                "The next favorite thing of your typical" +
                        " obese friend!"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 1, 5);
        addItemToOrder(order2, 0, 3);
        printOrder(order2);
    }

    public static void listProducts() {
        for (var item : products) {
            System.out.println("-".repeat(65));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,
                                      int quantity) {
        order.add(new OrderItem(quantity, products.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
