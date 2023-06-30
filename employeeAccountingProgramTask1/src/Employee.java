public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private double salary;

    public Employee(String firstName, String position) {
        this.firstName = firstName;
        this.position = position;
    }

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Employee() {
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPosition(String p) {
        this.position = p;
    }

    public void setSalary(double s) {
        this.salary = s;
    }

    public String getFullName() {
       return firstName + " - " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
    public String getEmployeeInfo() {
        return firstName + " - " + position + " - " + salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", position='" + position + '\'' +
                    ", salary=" + salary +
                    '}';
    }
}
