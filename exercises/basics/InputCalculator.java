import java.util.Scanner;

public class inputcalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int num;
        int sum = 0;
        int rep = 0;
        long avg = 0;
        Scanner sc = new Scanner(System.in);
        do {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                sum += num;
                rep++;
            } else {
                avg = (long) round(avg, rep);
                break;
            }
        } while (true);

        System.out.print("SUM = " + sum + " ");
        System.out.print("AVG = " + avg);
    }

    public static double round(double value, int rep) {
        value = Math.round((double) value / rep);
        return value;
    }
}
