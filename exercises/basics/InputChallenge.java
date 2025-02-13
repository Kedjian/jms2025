import java.util.Scanner;

public class inputchallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double num;
        int rep = 1;

        do {
            System.out.print("Enter integer #" + rep + ": ");
            try {
                num = Double.parseDouble(sc.nextLine());
                sum += num;
                rep++;
            } catch (NumberFormatException InvalidInput) {
                System.out.println("Invalid number.");
            }
        } while (rep < 6);

        System.out.println("The sum is " + sum + ".");
    }
}
