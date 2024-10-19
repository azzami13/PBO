public class EmployeeTest {
    public static void main(String[] args) {
        // Create an array of Employee and Manager objects
        Sortable[] staff = new Sortable[4];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1991, "John Doe");
        staff[2] = new Employee("Isabel Vidal", 3000000, 1993);
        staff[3] = new Manager("James Smith", 2800000, 1995, "Jane Roe");

        // Sort the staff array using shell_sort
        Sortable.shell_sort(staff);

        // Print out the sorted employee and manager details
        for (Sortable s : staff) {
            System.out.println(s);
        }
    }
}
