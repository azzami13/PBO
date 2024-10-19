import java.util.ArrayList;

// Kelas Abstrak
public abstract class MenuItem {
    protected String nama;
    protected double harga;

    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract void tampilkanInfo();

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
