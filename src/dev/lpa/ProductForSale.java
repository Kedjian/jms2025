package dev.lpa;

record OrderItem() {
    static int quantity;
    static ProductForSale product;
}

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void getSalesPrice(int quantity) {
        double salesPrice = quantity * price;
        System.out.println(getExplicitType() + "of product in "
                + quantity + " costs " + salesPrice + ".");
    }

    public void printPricedItem(int quantity) {

    }

    public abstract void showDetails();

    public final String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
