package dev.lpa;

public class Manager extends Employee {

    public Manager(String firstName, String lastName,
                   String companyName, int age, double hourlyWage,
                   double amountOfWorkHours) {
        super(firstName, lastName, companyName, age,
                hourlyWage, amountOfWorkHours);
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * amountOfWorkHours;
    }

    @Override
    public String displayInfo() {
        return firstName + " " + lastName + ", " +
                age + " years old is a " + getClass().getSimpleName()
                + " of " + companyName + ".";
    }
}
