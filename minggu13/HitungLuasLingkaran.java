import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HitungLuasLingkaran {

    // Inisialisasi logger
    private static final Logger logger = Logger.getLogger(HitungLuasLingkaran.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan pesan permintaan input
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Masukkan jari-jari lingkaran:");
        }

        // Membaca input pengguna
        double radius = sc.nextDouble();

        // Menghitung luas lingkaran
        double area = Math.PI * radius * radius;

        // Menampilkan hasil hanya jika level INFO diaktifkan
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("Jari-jari: %.2f, Luas lingkaran: %.2f", radius, area));
        }
    }
}
