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

        boolean ageCheck = isTooYoung(25); System.out.println(ageCheck);

        int highScorePosition = calculateHighScorePosition(1700);
        displayHighScorePosition("Sebastian", highScorePosition);

        highScorePosition = calculateHighScorePosition(870);
        displayHighScorePosition("Caroline", highScorePosition);

        highScorePosition = calculateHighScorePosition(320);
        displayHighScorePosition("Elias", highScorePosition);

        highScorePosition = calculateHighScorePosition(20);
        displayHighScorePosition("Oskar", highScorePosition);

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
    public static boolean isTooYoung(int age) {
        boolean result = false;
        if (age < 21) {
            result = true;
        }
        return result;
    }
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result;
        if (playerScore >= 1000) {
            result = 1;
        }
        else if (playerScore >= 500 && playerScore < 1000) {
            result = 2;
        }
        else if (playerScore >= 100 && playerScore < 500) {
            result = 3;
        }
        else {
            result = 4;
        }
        return result;
    }
}
