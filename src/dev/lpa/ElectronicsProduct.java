package dev.lpa;

public class ElectronicsProduct {
    String productID;
    String name;
    double price;

    public ElectronicsProduct(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateDiscount(ElectronicsProduct product, double discount) {
        double price = product.getPrice();
        return price - discount;
    }
}
