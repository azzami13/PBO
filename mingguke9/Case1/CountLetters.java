import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] jumlahHuruf = new int[26]; 
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata (huruf saja, tolong): ");
        String kata = scan.nextLine();

        kata = kata.toUpperCase();

        for (int i = 0; i < kata.length(); i++) {
            try {
                jumlahHuruf[kata.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }

        System.out.println();
        for (int i = 0; i < jumlahHuruf.length; i++) {
            if (jumlahHuruf[i] != 0) {
                System.out.println((char)(i + 'A') + ": " + jumlahHuruf[i]);
            }
        }
    }
}
