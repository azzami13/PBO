public class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireYear;

    // Constructor
    public Employee(String name, double salary, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for hireYear
    public int getHireYear() {
        return hireYear;
    }

    // Implement the compare method
    @Override
    public int compare(Sortable other) {
        Employee otherEmployee = (Employee) other;
        if (this.salary < otherEmployee.salary) return -1;
        if (this.salary > otherEmployee.salary) return 1;
        return 0;
    }

    // Method to raise the salary by a percentage
    public void raiseSalary(double byPercent) {
        salary += salary * byPercent / 100;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee[name=" + name + ", salary=" + salary + ", hireYear=" + hireYear + "]";
    }
}
