public class Circle {
    // Variabel instance privat
    private double radius; // Jari-jari lingkaran
    private String color; // Warna lingkaran

    // Konstruktor pertama: Nilai default untuk jari-jari dan warna
    public Circle() {
        radius = 1.0; // Mengatur jari-jari default menjadi 1.0
        color = "red"; // Mengatur warna default menjadi merah
    }

    // Konstruktor kedua: Mengatur jari-jari yang diberikan, warna default
    public Circle(double radius) {
        this.radius = radius; // Mengatur jari-jari berdasarkan parameter yang diberikan
        color = "red"; // Mengatur warna default menjadi merah
    }

    // Konstruktor ketiga: Mengatur jari-jari dan warna yang diberikan
    public Circle(double radius, String color) {
        this.radius = radius; // Mengatur jari-jari berdasarkan parameter yang diberikan
        this.color = color; // Mengatur warna berdasarkan parameter yang diberikan
    }

    // Getter untuk jari-jari
    public double getRadius() {
        return radius; // Mengembalikan nilai jari-jari
    }

    // Setter untuk jari-jari
    public void setRadius(double radius) {
        this.radius = radius; // Mengatur jari-jari dengan nilai baru
    }

    // Getter untuk warna
    public String getColor() {
        return color; // Mengembalikan nilai warna
    }

    // Setter untuk warna
    public void setColor(String color) {
        this.color = color; // Mengatur warna dengan nilai baru
    }

    // Metode untuk menghitung dan mengembalikan luas lingkaran
    public double getArea() {
        return radius * radius * Math.PI; // Menggunakan rumus luas lingkaran: π * r^2
    }

    // Metode untuk menghitung dan mengembalikan keliling lingkaran
    public double getCircumference() {
        return 2 * Math.PI * radius; // Menggunakan rumus keliling lingkaran: 2 * π * r
    }

    // Metode toString untuk mendeskripsikan objek lingkaran
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]"; // Mengembalikan string yang menjelaskan lingkaran
    }
}
