public class controlflowexercise {
    public static void main(String[] args) {
        String month = "JANUARY"; System.out.println(getQuarter(month));
        month = "JULY"; System.out.println(getQuarter(month));
        month = "Not a month"; System.out.println(getQuarter(month));

        String NATO = "A"; System.out.println(getNatoEquivalent(NATO));
        NATO = "B"; System.out.println(getNatoEquivalent(NATO));
        NATO = "E"; System.out.println(getNatoEquivalent(NATO));

    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> month + " is not valid.";
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
}

