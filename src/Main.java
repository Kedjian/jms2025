import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    }

    public static void temperatureTest() {
        Temperature celsius = new Temperature();
        celsius.CTF(50, 54);
        celsius.describeCndF();
        celsius.convertCTF();
        celsius.convertFTC();
    }

    public static void customerChrisTest() {
        Customer Chris = new Customer("Chris", 1500, "Fishfuck22@gmail.com");
        System.out.println(Chris.getName());
        System.out.println(Chris.getEmail());
        System.out.println(Chris.getCreditLimit());

        Customer Chris1 = new Customer();
        System.out.println(Chris1.getName());
        System.out.println(Chris1.getEmail());
        System.out.println(Chris1.getCreditLimit());

        Customer Chris2 = new Customer("Chris", "Fishfuck22@gmail.com");
        System.out.println(Chris2.getName());
        System.out.println(Chris2.getEmail());
        System.out.println(Chris2.getCreditLimit());
    }

    public static void buchwaldTest() {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("Full name: " + person.getFullName());
        System.out.println("Is teen? " + person.isTeen());
        person.setFirstName("Caroline");
        person.setAge(18);
        System.out.println("Full name: " + person.getFullName());
        System.out.println("Is teen? " + person.isTeen());
        person.setLastName("Buchwald");
        System.out.println("Full name: " + person.getFullName());
    }

    public static void calculatorTest() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(2.0);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());
        calculator.setFirstNumber(9.25);
        calculator.setSecondNumber(1.5);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());
    }

    public static void bankTest() {
        Scanner sc = new Scanner(System.in);

        BankAccount OsMak = new BankAccount("Chris-chan", "Chris-chan-desu@weebneet.com", "694201337");
        OsMak.describeBankAccount();

//        BankAccount OsMak = new BankAccount("12345",
//                1000.00, "Bob Brown",
//                "myemail@bob.com", "(087) 123-4567");

        do {
            System.out.println("What do you want to do? Print (1) to deposit. Print (2) to withdraw. ");
            String command = sc.nextLine();
            if (command.equals("1")) {
                System.out.println("Enter amount to deposit: ");
                double deposit = 0;
                try {
                    deposit = sc.nextDouble();
                } catch (InputMismatchException wrongData) {
                    System.out.println("Please enter a valid number.");
                }
                sc.nextLine();
                OsMak.DepositFunds(deposit);
            } else if (command.equals("2")) {
                System.out.println("Enter amount to withdraw: ");
                double withdraw = 0;
                try {
                    withdraw = sc.nextDouble();
                } catch (InputMismatchException wrongData) {
                    System.out.println("Please enter a valid number.");
                }
                sc.nextLine();
                OsMak.WithdrawFunds(withdraw);
            } else {
                System.out.println("Invalid command. Try again.");
            }
        } while (true);
    }
}