public class Worker {
    protected String firstName;
    protected String lastName;
    protected String position;
    protected final double salaryPer90Lesson = 85;
    protected final double salaryPerINDLesson = 55;
    protected int amountOf90Groups;
    protected int amountOfIndGroups;

    public Worker() {}

    public Worker(String firstName, String lastName, String position,
                  int amountOf90Groups, int amountOfIndLessons) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.amountOf90Groups = amountOf90Groups;
        this.amountOfIndGroups = amountOfIndLessons;
    }

    public int setAmountOf90Groups() {
        return amountOf90Groups;
    }

    public int setAmountOfIndLessons() {
        return amountOfIndGroups;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salaryPer90Lesson=" + salaryPer90Lesson +
                ", salaryPerINDLesson=" + salaryPerINDLesson +
                ", amountOf90Groups=" + amountOf90Groups +
                ", amountOfIndGroups=" + amountOfIndGroups +
                '}';
    }

    public void calculateSalary(String Month) {
        double salaryFor90Groups = (salaryPer90Lesson * amountOf90Groups) * 4;
        double salaryForIndLessons = (salaryPerINDLesson * amountOfIndGroups) * 4;
        double totalMonthlySalary = salaryFor90Groups + salaryForIndLessons;
        System.out.println("Total salary for " + Month + ": " + totalMonthlySalary);
        System.out.println("The salary halved to two payments: " + totalMonthlySalary / 2);
    }

    private int activeGroups;
    private double firstProlongations;
    private double longTermProlongations;
    private double overallProlongations;
    private double attendance;

    public void setQualityParameters(int activeGroups, double firstProlongations,
                                     double longTermProlongations, double overallProlongations,
                                     double attendance) {
        this.activeGroups = activeGroups;
        this.firstProlongations = firstProlongations;
        this.longTermProlongations = longTermProlongations;
        this.overallProlongations = overallProlongations;
        this.attendance = attendance;
    }

    public void calculateWorkQuality() {
        if (activeGroups > 5) {
            System.out.println("Active group parameter is fine.");
        } else {
            System.out.println("Active group parameter is not enough.");
        }
        if (firstProlongations < 40.0) {
            System.out.println("First prolongations parameter is too low.");
        } else {
            System.out.println("First prolongations parameter is enough.");
        }
        if (longTermProlongations < 40.0) {
            System.out.println("Long term prolongations parameter is too low.");
        } else {
            System.out.println("Long term prolongations parameter is enough.");
        }
        if (overallProlongations < 40.0) {
            System.out.println("Overall prolongations parameter is too low.");
        } else {
            System.out.println("Overall prolongations parameter is enough.");
        }
        if (attendance < 85.0) {
            System.out.println("Attendance parameter is too low.");
        } else {
            System.out.println("Attendance parameter is enough.");
        }
    }
}