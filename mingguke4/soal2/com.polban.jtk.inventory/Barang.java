public class Barang {
    // Mengubah atribut stok menjadi private
    private String kode_barang;
    private String nama_barang;
    private int stok;

    // Constructor
    public Barang(String kode, String nama, int stok) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stok;
    }

    // Getter untuk nama barang
    public String getNamaBarang() {
        return nama_barang;
    }

    // Getter untuk stok barang
    public int getStok() {
        return stok;
    }

    // Method untuk menambah stok barang
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }
}
