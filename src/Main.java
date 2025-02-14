import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

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

        BankAccount OsMak = new BankAccount();
        OsMak.setAccBalance(500);
        OsMak.setAccNumber("5123 5821 4823 9581 2831 5823 5621 2134");
        OsMak.setCustomerEmail("osma@gmail.com");
        OsMak.setPhoneNumber("+48 572 434 741");
        OsMak.setCustomerName("Oskar");

        OsMak.describeBankAccount();

        do {
            System.out.println("What do you want to do? Print (1) to deposit. Print (2) to withdraw. ");
            String command = sc.nextLine();
            if (command.equals("1")) {
                System.out.println("Enter amount to deposit: ");
                int deposit = 0;
                try {
                    deposit = sc.nextInt();
                } catch (InputMismatchException wrongData) {
                    System.out.println("Please enter a valid number.");
                }
                sc.nextLine();
                OsMak.DepositFunds(deposit);
            } else if (command.equals("2")) {
                System.out.println("Enter amount to withdraw: ");
                int withdraw = 0;
                try {
                    withdraw = sc.nextInt();
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