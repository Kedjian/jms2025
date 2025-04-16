package dev.lpa;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String firstName, String lastName,
                          String birthDate, double initialDeposit) {
        super(firstName, lastName, birthDate, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            initialDeposit += amount;
        } else {
            System.out.println("You can't deposit a negative number.");
        }
    }

    @Override
    public double withdraw(double amount) {
        if (amount > 0) {
            initialDeposit -= amount;
        } else {
            System.out.println("No need to specify the minus. Withdrawing means subtracting money from your account.");
        } return initialDeposit;
    }

    @Override
    public double showAccountState() {
        return initialDeposit;
    }
}
