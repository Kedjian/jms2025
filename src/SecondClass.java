public class SecondClass {

    public static void main(String[] args) {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double sum1sl = (num1 + num2) * 100.00d;
        System.out.println("TOTAL: " + sum1sl);
        double mod1sl = sum1sl % 40.00d;
        System.out.println("REMAINDER: " + mod1sl);
        boolean isZero = (mod1sl == 0) ? true : false;
        if (!isZero) {
            System.out.println("GOT REMAINDER.");
        }
        System.out.println("BOOLEAN IS EQUAL TO: " + isZero + ".");
    }
}
