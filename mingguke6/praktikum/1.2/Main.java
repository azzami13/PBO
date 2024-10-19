public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "yellow");
        System.out.println(circle1); // Output: Circle[radius=5.0, color=yellow]

        // Menghitung dan menampilkan area
        System.out.println("Luas: " + circle1.getArea());  // Output: Luas: 78.53981633974483
        
        // Menghitung dan menampilkan keliling
        System.out.println("Keliling: " + circle1.getCircumference());  // Output: Keliling: 31.41592653589793
        
        // Mengubah ukuran lingkaran
        circle1.resize(2); // Memperbesar radius dua kali
        System.out.println(circle1); // Output: Circle[radius=10.0, color=yellow]

        // Menampilkan area dan keliling setelah resize
        System.out.println("Luas setelah resize: " + circle1.getArea());
        System.out.println("Keliling setelah resize: " + circle1.getCircumference());
    }
}
