public class BankAccount {
    private String AccNumber;
    private double AccBalance;
    private String CustomerName;
    private String CustomerEmail;
    private String PhoneNumber;

    public BankAccount() {
        this("56789", 2.5, "Default name", "Default email", "Default phone number");
        System.out.println("Empty Bank Account Constructor called.");
    }

    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this("99999", 100.55, customerName, customerEmail, phoneNumber);
//        CustomerName = customerName;
//        CustomerEmail = customerEmail;
//        PhoneNumber = phoneNumber;
    }

    public BankAccount(String AccNumber, double AccBalance, String CustomerName, String CustomerEmail, String PhoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.AccNumber = AccNumber;
        this.AccBalance = AccBalance;
        this.CustomerName = CustomerName;
        this.CustomerEmail = CustomerEmail;
        this.PhoneNumber = PhoneNumber;
    }

    public String getAccNumber() {
        return AccNumber;
    }
    public double getAccBalance() {
        return AccBalance;
    }
    public String getCustomerName() {
        return CustomerName;
    }
    public String getCustomerEmail() {
        return CustomerEmail;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setAccNumber(String accNumber) {
        AccNumber = accNumber;
    }
    public void setAccBalance(int accBalance) {
        AccBalance = accBalance;
    }
    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public void describeBankAccount() {
        System.out.println("Acc Number: " + AccNumber);
        System.out.println("Acc Balance: " + AccBalance);
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Customer Email: " + CustomerEmail);
        System.out.println("Phone Number: " + PhoneNumber);
    }
    public void DepositFunds(double amount) {
        if (amount > 0) {
            AccBalance += amount;
            System.out.println("Your funds are now: " + getAccBalance() + ". You deposited: " + amount + ".");
        }
    }
    public void WithdrawFunds(double amount) {
        if (amount > 0) {
            if (amount > AccBalance) {
                System.out.println("Insufficient Funds");
                System.out.println("Amount left to deposit: " + getAccBalance());
            } else {
                AccBalance -= amount;
                System.out.println("Deposit Successful");
                System.out.println("Amount left to deposit: " + getAccBalance());
            }
        }
    }
}
