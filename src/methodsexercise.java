public class methodsexercise {
    public static void main(String[] args) {

        // Java's description of the method is: a declared executable code
        // that can be invoked, passing a fixed number of values as arguments.

        int highScore = calculateScore(true, 1000, 8, 500); System.out.println(highScore);
        highScore = calculateScore(true, 8100, 16, 340); System.out.println(highScore);

        simpleCalculator(2, 6, 4, 2);
        simpleCalculator(3, 6, 8, 1);

        System.out.println(calculateMyAge(2001));
        System.out.println(calculateMyAge(2007));
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
    public static void simpleCalculator(double a, double b, double c, double d) {

        double sum = a + b + c + d; System.out.println(sum);
        double sub = a - b - c - d; System.out.println(sub);
        double mul = a * b * c * d; System.out.println(mul);
        double div = a / b / c / d; System.out.println(div);
    }
    public static int calculateMyAge(int dateOfBirth) {

        return (2025 - dateOfBirth);
    }
}
