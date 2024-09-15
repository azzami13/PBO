import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays untuk menyimpan input
        String[] inputStrings = new String[3];
        int[] inputInts = new int[3];

        // Menampilkan garis pembatas
        System.out.println("================================");

        // Input data sebanyak 3 kali (string dan angka di satu baris)
        for (int i = 0; i < 3; i++) {
            System.out.print("Input string: ");
            inputStrings[i] = scanner.next();
            System.out.print("Input angka: ");
            inputInts[i] = scanner.nextInt();
        }

        // Memberikan jarak (newline) setelah input selesai
        System.out.println();

        // Output hasil yang diinput sebelumnya tanpa garis pembatas
        for (int i = 0; i < 3; i++) {
            // Menampilkan string dengan lebar 15 karakter, dan angka dengan format 3 digit
            System.out.printf("%-15s%03d%n", inputStrings[i], inputInts[i]);
        }

        // Menampilkan garis pembatas
        System.out.println("================================");

        // Menutup scanner untuk menghindari kebocoran sumber daya
        scanner.close();
    }
}