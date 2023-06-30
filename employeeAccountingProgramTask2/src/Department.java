public class Department {
    Employee director;
    Employee[] staff;
    private int departamentSize;
    private String departamentName;

    public Department() {
    }

    public Department(int departamentSize, String departamentName) {
        this.departamentSize = departamentSize;
        this.departamentName = departamentName;
    }

    public double calculateTotalSalary(Employee e) {
        double totalSalary = e.getSalary() + (e.getSalary() * e.getPosition().getBonus()) /100;
        return totalSalary;
    }

    public Employee getDirector() {
        return director;
    }

    public void setDirector(Employee director) {
        this.director = director;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }

    public int getDepartamentSize() {
        return departamentSize;
    }

    public void setDepartamentSize(int departamentSize) {
        this.departamentSize = departamentSize;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public void setDepartamentName(String departamentName) {
        this.departamentName = departamentName;
    }
}
