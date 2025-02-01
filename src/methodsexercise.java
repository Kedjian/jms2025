public class methodsexercise {
    public static void main(String[] args) {
        // Java's description of the method is: a declared executable code
        // that can be invoked, passing a fixed number of values as arguments.
        calculateScore(true, 1000, 8, 500);
        calculateScore(true, 8100, 16, 340);
        simpleCalculator(2, 6, 4, 2);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore + ".");
        }
    }
    public static void simpleCalculator(double a, double b, double c, double d) {
        double sum = a + b + c + d;
        double sub = a - b - c - d;
        double mul = a * b * c * d;
        double div = a / b / c / d;
        System.out.println("Sum of " + a + " and " + b + " and " + c + " and " + d + " = " + sum);
        System.out.println("Subtraction of " + a + " and " + b + " and " + c + " and " + d + " = " + sub);
        System.out.println("Multiplication of " + a + " and " + b + " and " + c + " and " + d + " = " + mul);
        System.out.println("Division of " + a + " and " + b + " and " + c + " and " + " = " + div);
    }
}
