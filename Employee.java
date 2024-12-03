public class Employee extends Person {
    private String employeeID;
    private double salary;
    private int experience;

    public Employee() {}

    public Employee(String name, int age, String gender,
                    String employeeID, double salary, int experience) {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.salary = salary;
        this.experience = experience;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
