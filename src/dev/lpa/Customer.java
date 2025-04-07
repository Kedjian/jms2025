package dev.lpa;
import java.util.*;

public class Customer {
    String name;
    ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, ArrayList<Double> transactions) {}

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}
