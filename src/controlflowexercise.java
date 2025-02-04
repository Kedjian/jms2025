public class controlflowexercise {
    public static void main(String[] args) {
        String month = "JANUARY"; System.out.println(getQuarter(month));
        month = "JULY"; System.out.println(getQuarter(month));
        month = "Not a month"; System.out.println(getQuarter(month));

        String natoCode = "A"; System.out.println(getNatoEquivalent(natoCode));
        natoCode = "B"; System.out.println(getNatoEquivalent(natoCode));
        natoCode = "E"; System.out.println(getNatoEquivalent(natoCode));

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
        printWeekDay(8);

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
}

