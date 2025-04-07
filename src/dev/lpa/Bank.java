package dev.lpa;
import java.util.*;

public class Bank {
    String name;
    ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer(String name) {
        for (var customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", name);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer newCustomer = new Customer(customerName, initialDeposit);
            customers.add(newCustomer);
            System.out.println("New customer added.");
        }
    }
}



