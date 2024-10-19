public class EmployeeTest {
    public static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1993);

        // Sort the staff array using shell_sort
        Sortable.shell_sort(staff);

        // Print out the sorted employee details
        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}
