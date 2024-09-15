import java.util.Scanner;

// Class Menu untuk menyimpan informasi tentang makanan
class Menu {
    private String namaMakanan;
    private double harga;
    private String deskripsi;

    public Menu(String namaMakanan, double harga, String deskripsi) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public double getHarga() {
        return harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void tampilkanInfoMakanan() {
        System.out.println("Nama Makanan: " + namaMakanan);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("-------------------------");
    }
}

// Class Pelanggan untuk menyimpan informasi pelanggan dan pembeliannya
class Pelanggan {
    private String namaPelanggan;
    private String identitas;
    private Menu[] pesanan;
    private int jumlahPesanan;

    public Pelanggan(String namaPelanggan, String identitas) {
        this.namaPelanggan = namaPelanggan;
        this.identitas = identitas;
        this.pesanan = new Menu[10]; // Maksimal pesanan adalah 10
        this.jumlahPesanan = 0;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getIdentitas() {
        return identitas;
    }

    public void tambahPesanan(Menu menu) {
        if (jumlahPesanan < 10) {
            pesanan[jumlahPesanan] = menu;
            jumlahPesanan++;
            System.out.println(menu.getNamaMakanan() + " berhasil ditambahkan ke pesanan.");
        } else {
            System.out.println("Tidak bisa menambah pesanan lagi, maksimal pesanan adalah 10.");
        }
    }

    public void tampilkanKeranjang() {
        System.out.println("Pesanan " + namaPelanggan + ":");
        double totalHarga = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            pesanan[i].tampilkanInfoMakanan();
            totalHarga += pesanan[i].getHarga();
        }
        System.out.println("Total Harga: Rp " + totalHarga);
    }

    public double getTotalHarga() {
        double totalHarga = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalHarga += pesanan[i].getHarga();
        }
        return totalHarga;
    }

    public void tampilkanStrukPembayaran() {
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Identitas: " + identitas);
        tampilkanKeranjang();
        System.out.println("Pembayaran berhasil! Terima kasih telah berbelanja di Kantin Pujasera.");
    }
}

// Class utama untuk menjalankan aplikasi
public class KantinPujasera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat beberapa objek Menu (makanan)
        Menu makanan1 = new Menu("Nasi Goreng", 15000, "Nasi goreng dengan ayam dan telur");
        Menu makanan2 = new Menu("Mie Goreng", 12000, "Mie goreng dengan sayuran segar");
        Menu makanan3 = new Menu("Ayam Bakar", 20000, "Ayam bakar dengan sambal dan lalapan");
        Menu[] daftarMenu = {makanan1, makanan2, makanan3};

        // Memilih Mahasiswa atau Dosen
        System.out.println("Selamat datang di Kantin Pujasera Polban");
        System.out.println("Anda adalah:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.print("Pilih (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membuang newline character

        String namaPelanggan, identitas;
        if (pilihan == 1) {
            // Mahasiswa
            System.out.print("Masukkan Nama: ");
            namaPelanggan = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            identitas = scanner.nextLine();
        } else if (pilihan == 2) {
            // Dosen
            System.out.print("Masukkan Nama: ");
            namaPelanggan = scanner.nextLine();
            System.out.print("Masukkan Kode Dosen: ");
            identitas = scanner.nextLine();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        Pelanggan pelanggan = new Pelanggan(namaPelanggan, identitas);

        // Proses pemilihan makanan
        boolean lanjutBelanja = true;
        while (lanjutBelanja) {
            System.out.println("\n--- Menu Makanan ---");
            for (int i = 0; i < daftarMenu.length; i++) {
                System.out.println((i + 1) + ". " + daftarMenu[i].getNamaMakanan() + " - Rp " + daftarMenu[i].getHarga());
            }
            System.out.print("Pilih nomor menu (1/2/3) atau 0 untuk selesai: ");
            int pilihanMenu = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character

            if (pilihanMenu == 0) {
                break;
            } else if (pilihanMenu > 0 && pilihanMenu <= daftarMenu.length) {
                pelanggan.tambahPesanan(daftarMenu[pilihanMenu - 1]);
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Apakah Anda ingin memesan lagi? (y/n): ");
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("y")) {
                lanjutBelanja = false;
            }
        }

        // Tampilkan keranjang belanja
        System.out.println("\n=== Keranjang Belanja ===");
        pelanggan.tampilkanKeranjang();

        // Proses pembayaran
        System.out.println("\nMetode Pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Debit/Kredit");
        System.out.print("Pilih metode pembayaran (1/2): ");
        int metodePembayaran = scanner.nextInt();
        scanner.nextLine(); // Membuang newline character

        if (metodePembayaran == 1 || metodePembayaran == 2) {
            System.out.println("\nPembayaran berhasil dilakukan.");
            pelanggan.tampilkanStrukPembayaran();
        } else {
            System.out.println("Metode pembayaran tidak valid.");
        }

        scanner.close();
    }
}
