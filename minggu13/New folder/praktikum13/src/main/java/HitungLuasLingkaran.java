import java.util.Scanner;

public class HitungLuasLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jari-jari:");
        double r = sc.nextDouble();
        double luas = 3.14 * r * r;
        System.out.println("Luas lingkaran adalah: " + luas);
    }
}


