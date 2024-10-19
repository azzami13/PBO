public class Main {
    public static void main(String[] args) {
        // Membuat lingkaran dengan nilai default
        Circle circle1 = new Circle();
        System.out.println(circle1); // Output: Circle[radius=1.0, color=red]

        // Membuat lingkaran dengan radius tertentu, warna default
        Circle circle2 = new Circle(5.0);
        System.out.println(circle2); // Output: Circle[radius=5.0, color=red]

        // Membuat lingkaran dengan radius dan warna tertentu
        Circle circle3 = new Circle(7.0, "blue");
        System.out.println(circle3); // Output: Circle[radius=7.0, color=blue]

        // Mengubah warna lingkaran
        circle3.setColor("green");
        System.out.println(circle3); // Output: Circle[radius=7.0, color=green]

        // Menampilkan area dan keliling lingkaran
        System.out.println("Luas lingkaran 3: " + circle3.getArea());
        System.out.println("Keliling lingkaran 3: " + circle3.getCircumference());
    }
}
