package dev.lpa;

import java.util.ArrayList;

class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public void addTransaction(Double value) {
        transactions.add(value);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    String getName() {
        return name;
    }
}

class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (Customer checkedCustomer : customers) {
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " [" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch checkedBranch : branches) {
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }
}
