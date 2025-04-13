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

    public double calculateFlatAmountDiscount(double discount) {
        return price - discount;
    }

    public double calculatePercentageDiscount(int percentage) {
        return price * percentage / 100;
    }
}

class WashingMachine extends ElectronicsProduct {

    private int warrantyDays;

    public WashingMachine(String productID, String name, double price, int warrantyDays) {
        super(productID, name, price);
        this.warrantyDays = warrantyDays;
    }

    public void extendWarranty(int dayAmount) {
        warrantyDays = warrantyDays + dayAmount;
    }

    public int getWarrantyDays() {
        return warrantyDays;
    }
}
