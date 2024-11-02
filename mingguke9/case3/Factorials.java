import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        String lanjutkan = "y";
        Scanner scan = new Scanner(System.in);

        while (lanjutkan.equalsIgnoreCase("y")) {
            try {
                System.out.print("Masukkan bilangan bulat: ");
                int val = scan.nextInt();

                System.out.println("Faktorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println("Kesalahan: " + e.getMessage());
            }

            System.out.print("Ingin menghitung faktorial lagi? (y/n): ");
            lanjutkan = scan.next();
        }
    }
}
