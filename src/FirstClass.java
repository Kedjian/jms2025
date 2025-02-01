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

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100!");
        }
        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("At least one is true. Greater than second top score or less than 100!");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is not an error.");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("I'm car, and this is not supposed to happen.");
        }
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country.");
        }
        else {
            System.out.println("This car is not domestic to our country.");
        }
        int ageOfClient = 16;
        String ageText = (ageOfClient >= 18) ? "over eighteen" : "still a kid";
        System.out.println("Our client is " + ageText + ".");

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }
}