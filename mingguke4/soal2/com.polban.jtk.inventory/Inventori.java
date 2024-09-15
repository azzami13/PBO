public class Inventori {
    Barang[] barangs;

    // Inisialisasi barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    // Menampilkan daftar barang
    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + " (" +
                barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + " (" +
                barangs[1].getStok() + ")");
    }

    // Metode untuk pengadaan barang (hanya penambahan stok)
    void pengadaan() {
        initBarang();

        // Menambah stok barang pertama (Baju) sebanyak 20
        barangs[0].tambahStok(20);

        // Tidak ada operasi pengurangan atau perkalian stok lagi

        // Tampilkan barang setelah penambahan stok
        showBarang();
    }

    public static void main(String[] args) {
        Inventori inventori = new Inventori();
        inventori.pengadaan();
    }
}
