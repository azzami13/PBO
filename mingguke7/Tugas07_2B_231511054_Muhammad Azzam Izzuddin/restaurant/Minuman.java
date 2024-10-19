// Kelas Implementasi untuk Minuman
public class Minuman extends MenuItem implements DapatDidiskon {
    private double volume; // dalam liter
    private String jenis; // Jenis minuman (misalnya: soda, jus, alkohol)

    public Minuman(String nama, double harga, double volume, String jenis) {
        super(nama, harga);
        this.volume = volume;
        this.jenis = jenis;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("Item Minuman: %s, Harga: $%.2f, Volume: %.1f L, Jenis: %s\n", nama, harga, volume, jenis);
    }

    @Override
    public void terapkanDiskon(double persentase) {
        double jumlahDiskon = harga * (persentase / 100);
        harga -= jumlahDiskon;
    }
}
