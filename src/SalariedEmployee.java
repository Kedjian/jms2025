public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public double collectPay() {
        if (isRetired) {
            System.out.println(name + " is earning currently: " + (annualSalary - (annualSalary * 0.1)));
            return annualSalary - (annualSalary * 0.1);
        }
        else {
            System.out.println(name + " is earning currently: " + (annualSalary - (annualSalary * 0.3)));
            return annualSalary - (annualSalary * 0.3);
        }
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    public boolean retire() {
        terminate("12/12/2025");
        return isRetired = true;
    }
}
