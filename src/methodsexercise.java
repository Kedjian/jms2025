public class methodsexercise {
    public static void main(String[] args) {
        // Java's description of the method is: a declared executable code
        // that can be invoked, passing a fixed number of values as arguments.
        calculateScore(true, 1000, 8, 500);
        calculateScore(true, 8100, 16, 340);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore + ".");
        }
    }
}
