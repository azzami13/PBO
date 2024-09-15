import java.util.Scanner;

public class soal5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input plat nomor mobil
        System.out.print("Masukkan plat nomor 4 mobil (dalam satu baris): ");
        String[] platNomor = new String[4];
        for (int i = 0; i < platNomor.length; i++) {
            platNomor[i] = scanner.next();
        }

        // Gabungkan semua plat nomor
        String gabunganPlat = String.join("", platNomor);

        // Hitung mod 5 dari gabunganPlat - 999999 secara bertahap
        int mod = hitungMod(gabunganPlat);

        // Hitung mod 5 dari 999999
        int angka999999Mod = 999999 % 5;

        // Hitung hasil akhir dan pastikan positif
        int hasilAkhir = (mod - angka999999Mod + 5) % 5;

        // Cek apakah hasil dibagi 5 memiliki sisa 0
        if (hasilAkhir == 0) {
            System.out.println("jalan");
        } else {
            System.out.println("berhenti");
        }

        scanner.close();
    }

    // Method untuk menghitung mod 5 dari gabungan plat nomor
    private static int hitungMod(String gabunganPlat) {
        int mod = 0;
        for (int i = 0; i < gabunganPlat.length(); i++) {
            char karakter = gabunganPlat.charAt(i);
            // Pastikan karakter adalah digit
            if (Character.isDigit(karakter)) {
                mod = (mod * 10 + (karakter - '0')) % 5;
            }
        }
        return mod;
    }
}
