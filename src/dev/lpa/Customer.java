package dev.lpa;
import java.util.*;

public class Customer {
    String name;
    ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public Customer(String name, double initialDeposit) {
        this(name,
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    public String getName() {
        return name;
    }
}
