public class SecondClass {

    public static void main(String[] args) {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double sum1sl = (num1 + num2) * 100.00d;
        System.out.println("Total: " + sum1sl);
        double mod1sl = sum1sl % 40.00d;
        System.out.println("Remainder: " + mod1sl);
        boolean isZero = (mod1sl == 0) ? true : false;
        if (!isZero) {
            System.out.println("Got some remainder.");
        }
        System.out.println("Boolean is equal to: " + isZero + ".");
    }
}
