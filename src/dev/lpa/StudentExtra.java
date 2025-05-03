package dev.lpa;

import dev.lpa.util.QueryItem;
import static dev.lpa.Student.random;

public class StudentExtra implements QueryItem {

    private String name;
    private String course;
    private int yearStarted;

    protected static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    protected static String[] courses = {"C++", "Java", "Python"};

    public StudentExtra() {
        int lastNameIndex = random.nextInt(85, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2025);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {

        String fName = fieldName.toUpperCase();
        return switch(fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }
}
