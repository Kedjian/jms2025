public class Worker {
    private String firstName;
    private String lastName;
    private String position;
    private double salaryPer90Lesson = 85;
    private double salaryPerINDLesson = 55;
    private int amountOf90Groups;
    private int amountOfIndGroups;

    public Worker(String firstName, String lastName, String position,
                  int amountOf90Groups, int amountOfIndLessons) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salaryPer90Lesson = salaryPer90Lesson;
        this.salaryPerINDLesson = salaryPerINDLesson;
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
        System.out.println("Total Salary for " + Month + ": " + totalMonthlySalary);
        System.out.println("The salary halved to two payments: " + totalMonthlySalary / 2);
    }
}


