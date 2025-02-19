public class Employee extends Worker {
    protected long employeeId;
    protected String hireData;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireData) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireData = hireData;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireData='" + hireData + '\'' +
                "} " + super.toString();
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getHireData() {
        return hireData;
    }

    public void setHireData(String hireData) {
        this.hireData = hireData;
    }
}
