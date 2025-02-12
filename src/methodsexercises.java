public class methodsexercises {
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
        printConversion(1.5);
        printMegaBytesAndKiloBytes(2500);
        shouldWakeUp(true, 1);
        isLeapYear(-1600);
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        hasEqualSum(1, 1, 1);
        hasTeen(9, 99, 19);
        isTeen(13);
        convertToCentimeters(5, 8);
        getDurationString(7622);
        area(5.0);
        printYearsAndDays(525600);
        printEqual(1, 1, 1);
        isCatPlaying(true, 10);
        isJohnSatisfied("Saturday", true, 1, 6);
        didBidufGraduate(true, true, false);
        isADividableOfB(6,2);


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
    public static double convertToCentimeters(int heightInInches) {
        double centimeters = heightInInches * 2.54;
        System.out.println("Result: " + centimeters + ".");
        return centimeters;
    }
    public static void convertToCentimeters(int heightInFeet, int heightInInches) {
        double feetToInches = heightInFeet * 12 + heightInInches;
        int feetToInchesInt = (int) feetToInches;
        convertToCentimeters(feetToInchesInt);
    }
    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        return getDurationString(seconds, minutes);
        }
    public static String getDurationString(int seconds, int minutes) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        System.out.println(hours + "h:" + remainingMinutes + "m:" + remainingSeconds + "s.");
        return hours + " hours and " + remainingMinutes + " minutes and " + remainingSeconds + " seconds.";
    }
    public static double area(double radius) {
        if (radius >= 0) {
            double area = Math.PI * radius * radius; System.out.println(area); return area;
        } else {
            System.out.println("Invalid input."); return -1.0;
        }
    }
    public static double area(double x, double y) {
        if (x >= 0 && y >= 0) {
            double area = Math.PI * x * y; System.out.println(area); return x * y;
        } else {
            System.out.println("Invalid input."); return -1.0;
        }
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            int min_per_hour = 60; int hours_per_day = 24; int days_per_year = 365;
            int min_per_day = hours_per_day * min_per_hour; int min_per_year = min_per_hour * hours_per_day * days_per_year;
            long years = minutes / min_per_year;
            long days = (minutes / min_per_day) % days_per_year;
            System.out.println(minutes + "min = " + years + "y and " + days + "d.");
        } else {
            System.out.println("Invalid value.");
        }
    }
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid value.");
        } else if (a == b && b == c && c == a) {
            System.out.println("All numbers are equal.");
        } else if (a != b && b != c && c != a) {
            System.out.println("All numbers are different.");
        } else {
            System.out.println("Neither all are equal or different.");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == false && temperature >= 25 && temperature <= 35) {
            String message = "The cat is playing."; System.out.println(message);
            return true;
        } else if (summer == true && temperature >= 25 && temperature <= 45) {
                String message = "The cat is playing."; System.out.println(message);
                return true;
        } else {
            String message = "The cat is not playing."; System.out.println(message);
            return false;
        }
    }
    public static boolean isJohnSatisfied(String day, boolean energy, int restTimeInHours, int workTimeInHours) {
        boolean isRested = false;
        if (day == "Saturday") {
            if (energy) {
                double thresholdValue = workTimeInHours * 0.25;
                if (restTimeInHours >= thresholdValue) {
                    isRested = true;
                    if (isRested) {
                        System.out.println("John enjoys a good saturday of balanced work.");
                        return true;
                    }
                } System.out.println("John can't enjoy his saturday. He didn't allow himself to rest enough."); return false;
            } System.out.println("John was too tried to begin with. He didn't even start."); return false;
        } System.out.println("John hates working on days that aren't a saturday."); return false;
    }
    public static boolean didBidufGraduate(boolean maths, boolean matlab, boolean electrotechnics) {
        if (maths == true) {
            if (matlab == true || electrotechnics == true) {
                System.out.println("Biduf did graduate.");
            }
        } else if (matlab == true) {
            if (maths == true || electrotechnics == true) {
                System.out.println("Biduf did graduate.");
            }
        } else if (electrotechnics == true) {
            if (maths == true || matlab == true) {
                System.out.println("Biduf did graduate.");
            }
        } return false;
    }
    public static boolean isADividableOfB(int a, int b) {
        if (a > 0 && b != 0 && b > 0) {
            if (a % b == 0) {
                System.out.println(a + " is dividable by " + b + ".");
                return false;
            } else {
                System.out.println(a + " isn't dividable by " + b + ".");
                return true;
            }
        } System.out.println("Invalid input."); return false;
    }
}