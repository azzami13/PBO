import java.util.Scanner;

public class soalnomor3 {public static void main(String[] args) {
    // Membuat Scanner untuk input
    Scanner scanner = new Scanner(System.in);

    // Meminta pengguna memasukkan dua angka
    System.out.print("Masukkan angka pertama: ");
    int A = scanner.nextInt();
    System.out.print("Masukkan angka kedua: ");
    int B = scanner.nextInt();

    // Menampilkan menu operasi
    System.out.println("Pilih operasi yang diinginkan:");
    System.out.println("1. Penjumlahan (+)");
    System.out.println("2. Pengurangan (-)");
    System.out.println("3. Perkalian (*)");
    System.out.println("4. Pembagian (/)");
    System.out.println("5. Sisa hasil bagi (%)");

    // Meminta pengguna memilih operasi
    System.out.print("Masukkan nomor operasi (1-5): ");
    int pilihan = scanner.nextInt();

    int hasil = 0;
    boolean valid = true; // untuk mengecek apakah input valid

    // Menggunakan switch-case untuk setiap operasi
    switch (pilihan) {
        case 1:
            hasil = A + B;
            System.out.println("Hasil penjumlahan: " + hasil);
            break;
        case 2:
            hasil = A - B;
            System.out.println("Hasil pengurangan: " + hasil);
            break;
        case 3:
            hasil = A * B;
            System.out.println("Hasil perkalian: " + hasil);
            break;
        case 4:
            if (B != 0) {  // Menghindari pembagian dengan nol
                hasil = A / B;
                System.out.println("Hasil pembagian: " + hasil);
            } else {
                System.out.println("Error: Tidak bisa membagi dengan nol.");
                valid = false;
            }
            break;
        case 5:
            if (B != 0) {  // Menghindari sisa bagi dengan nol
                hasil = A % B;
                System.out.println("Hasil sisa bagi: " + hasil);
            } else {
                System.out.println("Error: Tidak bisa mengambil sisa hasil bagi dengan nol.");
                valid = false;
            }
            break;
        default:
            System.out.println("Pilihan tidak valid.");
            valid = false;
            break;
    }

    // Menutup scanner setelah digunakan
    scanner.close();
}
}