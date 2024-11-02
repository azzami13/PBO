import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan satu baris teks yang mengandung angka:");
        String baris = scan.nextLine();

        Scanner scanLine = new Scanner(baris);

        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val; 
            } catch (NumberFormatException e) {
            }
        }

        System.out.println("Jumlah angka-angka di baris ini adalah: " + sum);
    }
}
