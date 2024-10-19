public class Manager extends Employee {
    private String secretaryName;

    // Constructor
    public Manager(String name, double salary, int hireYear, String secretaryName) {
        super(name, salary, hireYear);  // Call Employee constructor
        this.secretaryName = secretaryName;
    }

    // Getter for secretary name
    public String getSecretaryName() {
        return secretaryName;
    }

    // Setter for secretary name
    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Manager[name=" + getName() + ", salary=" + getSalary() + ", hireYear=" + getHireYear()
                + ", secretaryName=" + secretaryName + "]";
    }
}
