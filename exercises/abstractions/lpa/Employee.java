package dev.lpa;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String companyName;
    protected int age;
    protected double hourlyWage;
    protected double amountOfWorkHours;
    protected double salary;

    public Employee(String firstName,
                    String lastName,
                    String companyName,
                    int age,
                    double hourlyWage,
                    double amountOfWorkHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.age = age;
        this.hourlyWage = hourlyWage;
        this.amountOfWorkHours = amountOfWorkHours;
    }

    public abstract double calculateSalary();
    public abstract String displayInfo();
}
