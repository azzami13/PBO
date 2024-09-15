import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Konstanta gaji pokok dan harga per item
        final int GAJI_POKOK = 500000;
        final int HARGA_PER_ITEM = 50000;

        // Input jumlah penjualan bulan ini
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = scanner.nextInt();

        // Hitung total penjualan
        int totalPenjualan = jumlahPenjualan * HARGA_PER_ITEM;
        double gajiAkhir = GAJI_POKOK;

        // Hitung bonus atau denda berdasarkan jumlah penjualan
        if (jumlahPenjualan >= 40 && jumlahPenjualan <= 80) {
            // Bonus 25% jika penjualan antara 40 dan 80 item
            gajiAkhir += totalPenjualan * 0.25;
        } else if (jumlahPenjualan > 80) {
            // Bonus 35% jika penjualan lebih dari 80 item
            gajiAkhir += totalPenjualan * 0.35;
        } else if (jumlahPenjualan < 15) {
            // Denda 15% dari kekurangan penjualan ke 15 item
            int kekurangan = 15 - jumlahPenjualan;
            double denda = kekurangan * HARGA_PER_ITEM * 0.15;
            gajiAkhir -= denda;
        } else {
            // Bonus 10% jika penjualan di bawah 40 item tapi tidak kurang dari 15
            gajiAkhir += totalPenjualan * 0.10;
        }

        // Cetak gaji akhir
        System.out.printf("Gaji yang diterima: %.0f%n", gajiAkhir);

        // Menutup scanner untuk menghindari kebocoran sumber daya
        scanner.close();
    }
}
