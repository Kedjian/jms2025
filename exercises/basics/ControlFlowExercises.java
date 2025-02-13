public class controlflowexercises {
    public static void main(String[] args) {
        String month = "JANUARY";
        System.out.println(getQuarter(month));
        month = "JULY";
        System.out.println(getQuarter(month));
        month = "Not a month";
        System.out.println(getQuarter(month));

        String natoCode = "A";
        System.out.println(getNatoEquivalent(natoCode));
        natoCode = "B";
        System.out.println(getNatoEquivalent(natoCode));
        natoCode = "E";
        System.out.println(getNatoEquivalent(natoCode));

        printDayOfWeek(0);
        printWeekDay(0);
        printNumberInWord(1);
        sumOdd(1, 100);
        sumDigits(125);
        isPalindrome(121);
        sumFirstAndLastDigit(515);
        getEvenDigitSum(123456789);
        hasSharedDigit(12, 23);
        printFactors(6);
        hasSameLastDigit(11, 22, 31);
        getGreatestCommonDivisor(25,15);
        isPerfectMethod(6);
        numberToWords(23);
        canPack(1,0,4);

        int startNum = 5;
        int endNum = 20;

        while (startNum <= endNum) {
            startNum++;
            if (!isEvenNumber(startNum)) {
                continue;
            } System.out.println("Even number: " + startNum + ".");
        }

        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        int k = 1;
        while (k <= 5) {
            System.out.println(k);
            k++;
        }

        int l = 1;
        do {
            System.out.println(l);
            l++;
        } while (l <= 5);

        int num = 0;
        while (num < 50) {
            num += 5;
            if (num % 25 == 0) {
                continue;
            } System.out.print(num + "_");
        } System.out.println(".");

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + " % interest = " + interestAmount);
        }

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateInterest(100.00, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100.00 at " + rate + " % interest = $" + interestAmount + ".");
        }

        int primeCounter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println("Prime at " + i + ".");
                primeCounter++;
                if (primeCounter == 10) {
                    break;
                }
            }
        }

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found a match = " + i + ".");
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Total matches = " + sum + ".");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st.";
            case "APRIL", "MAY", "JUNE" -> "2nd.";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd.";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th.";
            default -> " '" + month + "' " + " is not valid.";
        };
    }

    public static String getNatoEquivalent(String letter) {
        return switch (letter) {
            case "A" -> "Able.";
            case "B" -> "Baker.";
            case "C" -> "Charlie.";
            case "D" -> "Dog.";
            case "E" -> "Easy.";
            default -> letter + " is not valid.";
        };
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Sunday.");
            case 1 -> System.out.println("Monday.");
            case 2 -> System.out.println("Tuesday.");
            case 3 -> System.out.println("Wednesday.");
            case 4 -> System.out.println("Thursday.");
            case 5 -> System.out.println("Friday.");
            case 6 -> System.out.println("Saturday.");
            default -> System.out.println("Invalid day.");
        }
    }

    public static void printWeekDay(int day) {
        if (day == 1) {
            System.out.println("Sunday.");
        } else if (day == 2) {
            System.out.println("Monday.");
        } else if (day == 3) {
            System.out.println("Tuesday.");
        } else if (day == 4) {
            System.out.println("Wednesday.");
        } else if (day == 5) {
            System.out.println("Thursday.");
        } else if (day == 6) {
            System.out.println("Friday.");
        } else if (day == 7) {
            System.out.println("Saturday.");
        } else {
            System.out.println("Invalid day.");
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0 -> System.out.println("Zero.");
            case 1 -> System.out.println("One.");
            case 2 -> System.out.println("Two.");
            case 9 -> System.out.println("Nine.");
            default -> System.out.println("Other.");
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int num) {
        if (num > 0) {
            if (num % 2 == 1) {
                return true;
            } return false;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start <= end && start > 0) {
            for (int i = start; (i <= end); i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            } System.out.println(sum + ".");
        } return -1;
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } return false;
    }

    public static int sumDigits(int n) {
        int sum = 0;
        if (n > 0) {
            while (n > 9) {
                sum += (n % 10);
                n = n / 10;
            } sum += n;
            System.out.println(sum + "."); return sum;
        } return -1;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        while (original != 0) {
            int lastDigit = original % 10;
            reverse = reverse * 10 + lastDigit;
            original /= 10;
        } if (number == reverse) {
            System.out.println(number + " is a palindrome.");
            return true;
        } else {
            System.out.println(number + " is not a palindrome.");
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int firstDigit = number;
            int lastDigit = number % 10;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            } System.out.println("Works."); return firstDigit + lastDigit;
        } return -1;
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number >= 0) {
            for (int i = number; i > 0; i /= 10) {
                int lastDigit = i % 10;
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
            } return sum;
        } return -1;
    }

    public static boolean hasSharedDigit(int n1, int n2) {
        boolean firstValid = (n1 > 9 && n1 < 100);
        boolean secondValid = (n2 > 9 && n2 < 100);

        if (!firstValid && !secondValid) {
            return false;
        }

        int firstLeftDigit = n1 / 10;
        int firstRightDigit = n1 % 10;
        int secondLeftDigit = n2 / 10;
        int secondRightDigit = n2 % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondRightDigit || firstRightDigit == secondLeftDigit;

        return firstShared || secondShared;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000)
            return true;
            else {
                return false;
        }
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }

        int lastN1 = n1 % 10;
        int lastN2 = n2 % 10;
        int lastN3 = n3 % 10;

        return (lastN1 == lastN2) || (lastN1 == lastN3) || (lastN2 == lastN3);
    }

    public static void printFactors(int n) {
        if (n < 1) {
            System.out.println("Invalid value.");
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " is a factor of " + n + ".");
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int gcd = 0;
        int smallerNum = 0;

        if (first > second) {
            smallerNum = second;
        } else {
            smallerNum = first;
        }

        for (int i = 1; i <= smallerNum; i++) {
            for (int j = i; j <= smallerNum; j++) {
                if (first % j == 0 && second % j == 0) {
                    gcd = j;
                }
            }
        } return gcd;
    }

    public static boolean isPerfectMethod(int num) {
        if (num < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (sum == num) {
                    return true;
                }
            }
        } return false;
    }

    public static void numberToWords(int num) {
        for (int i = 1; num > 0; i++ ) {
            int temp = num % 10;
            int reverse = reverse(temp);
            switch (reverse) {
                case 0 -> System.out.print(" Zero ");
                case 1 -> System.out.print(" One ");
                case 2 -> System.out.print(" Two ");
                case 3 -> System.out.print(" Three ");
                case 4 -> System.out.print(" Four ");
                case 5 -> System.out.print(" Five ");
                case 6 -> System.out.print(" Six ");
                case 7 -> System.out.print(" Seven ");
                case 8 -> System.out.print(" Eight ");
                case 9 -> System.out.print(" Nine ");
            }
            num = num / 10;
        }
        System.out.println();
    }

    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        } return reverse;
    }

    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        } else if (num == 0) {
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= num; i *= 10) {
            count++;
        } return count;
    }

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}


