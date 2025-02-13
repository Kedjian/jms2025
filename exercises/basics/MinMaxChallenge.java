import java.util.Scanner;

public class minmaxchallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int min = 0;
        int max = 0;

        do {
            System.out.println("Enter a number to continue or any character to break: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            } else {
                break;
            }
        } while (true);

        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}
