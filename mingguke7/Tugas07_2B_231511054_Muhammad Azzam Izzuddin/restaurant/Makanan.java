// Kelas Implementasi untuk Makanan
public class Makanan extends MenuItem implements DapatDidiskon {
    private String jenis; // Jenis makanan (misalnya: pembuka, utama, penutup)

    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("Item Makanan: %s, Harga: $%.2f, Jenis: %s\n", nama, harga, jenis);
    }

    @Override
    public void terapkanDiskon(double persentase) {
        double jumlahDiskon = harga * (persentase / 100);
        harga -= jumlahDiskon;
    }
}
