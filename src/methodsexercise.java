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

        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-0.75);

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);

        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);

        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
        hasEqualSum(5, 5, 10);
        hasEqualSum(3, 6, 15);

        hasTeen(9, 99, 19);
        hasTeen(23,15,42);
        hasTeen(22,23,24);
        isTeen(13);
        isTeen(17);
        isTeen(69);

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
        else if (playerScore >= 500) {
            result = 2;
        }
        else if (playerScore >= 100) {
            result = 3;
        }
        else {
            result = 4;
        }
        return result;
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        }
        else if (number == 0) {
            System.out.println(number + " is a zero number.");
        }
        else {
            System.out.println(number + " is a negative number.");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour <= 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour * 0.6214);
        }
    }
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour <= 0) {
            System.out.println("Invalid value.");
        } else {
            System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + " m/h.");
        }
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid value.");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB = " + kilobytes + "KB.");
        }
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
        } else {
            if (barking && hourOfDay < 8 || hourOfDay > 22) {
                System.out.println("True. "); return true;
            } else {
                System.out.println("False. "); return false;
            }
        } System.out.println("False. "); return false;
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap year.");
                return true;
            }
            else
                System.out.println("Not a leap year.");
                return false;
        }
        else {
            System.out.println("Invalid input.");
            return false;
        }
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double holdNum1 = a; double holdNum2 = b;
        a = (long) (a * 1000); b = (long) (b * 1000);
        if (a == b) {
            System.out.println(holdNum1 + " and " + holdNum2 + " are equal.");
            return true;
        } else
            System.out.println(holdNum1 + " and " + holdNum2 + " are not equal.");
            return false;
    }
    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            System.out.println(a + " + "  + b + " " + "equals " + c + ".");
            return true;
        } else {
            System.out.println(a + " +" + " " + b + " does not equal to " + c + ".");
            return false;
        }
    }
    public static boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
            System.out.println("At least one of the values is in range of 13 and 19.");
            return true;
        } System.out.println("No value is in range of 13 and 19"); return false;
    }
    public static boolean isTeen(int a) {
        if (a >= 13 && a <= 19) {
            System.out.println("The value is in range of 13 and 19.");
            return true;
        } System.out.println("The value is not in range of 13 and 19"); return false;
    }
}