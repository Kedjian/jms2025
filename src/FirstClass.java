public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello, Oscar! I'm glad you're learning me.");

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("I'm not alien.");

        boolean isEliasGay = true;
        if (!isEliasGay)
            System.out.println("Elias isn't gay.");
        else
            System.out.println("Elias is pretty gay.");

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        else
            System.out.println("You didn't get the high score!");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100!");
        }
    }
}