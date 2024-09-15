import java.util.Scanner;

public class soal6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 4 plat nomor dalam satu baris
        System.out.print("Masukkan plat nomor 4 mobil: ");
        String plat1 = scanner.next();
        String plat2 = scanner.next();
        String plat3 = scanner.next();
        String plat4 = scanner.next();

        // Gabungkan semua plat nomor
        String gabunganPlat = plat1 + plat2 + plat3 + plat4;

        // Hitung mod 5 dari gabunganPlat - 999999 secara bertahap
        int mod = 0;
        for (int i = 0; i < gabunganPlat.length(); i++) {
            mod = (mod * 10 + (gabunganPlat.charAt(i) - '0')) % 5;
        }

        int angka999999Mod = 999999 % 5;
        int hasilAkhir = (mod - angka999999Mod + 5) % 5;

        // Cek apakah hasil dibagi 5 memiliki sisa 0
        if (hasilAkhir == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }

        scanner.close();
    }
}