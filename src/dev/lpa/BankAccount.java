package dev.lpa;

public abstract class BankAccount {
    protected String firstName;
    protected String lastName;
    protected String birthDate;
    protected double initialDeposit;

    public BankAccount(String firstName, String lastName,
                        String birthDate, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.initialDeposit = initialDeposit;
    }

    public abstract void deposit(double amount);
    public abstract double withdraw(double amount);
    public abstract double showAccountState();

}
