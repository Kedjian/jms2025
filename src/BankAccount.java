public class BankAccount {
    private String AccNumber;
    private int AccBalance;
    private String CustomerName;
    private String CustomerEmail;
    private String PhoneNumber;

    public BankAccount() {
        System.out.println("Bank Account Constructor");
    }

    public BankAccount(String AccNumber, double AccBalance, String CustomerName, String CustomerEmail, String PhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.AccNumber = AccNumber;
        this.AccBalance = (int) AccBalance;
        this.CustomerName = CustomerName;
        this.CustomerEmail = CustomerEmail;
        this.PhoneNumber = PhoneNumber;
    }

    public String getAccNumber() {
        return AccNumber;
    }
    public int getAccBalance() {
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
    public void DepositFunds(int amount) {
        if (amount > 0) {
            AccBalance += amount;
            System.out.println("Your funds are now: " + getAccBalance() + ". You deposited: " + amount + ".");
        }
    }
    public void WithdrawFunds(int amount) {
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
