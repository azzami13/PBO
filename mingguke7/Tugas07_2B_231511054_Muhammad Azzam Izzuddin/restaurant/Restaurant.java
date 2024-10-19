import java.util.ArrayList;

// Kelas Utama untuk Sistem Manajemen Restoran
public class Restaurant {
    private ArrayList<MenuItem> menu;
    private ArrayList<MenuItem> pesanan;

    public Restaurant() {
        menu = new ArrayList<>();
        pesanan = new ArrayList<>();
    }

    public void tambahkanKeMenu(MenuItem item) {
        menu.add(item);
    }

    public void tampilkanMenu() {
        System.out.println("Menu Restoran:");
        for (MenuItem item : menu) {
            item.tampilkanInfo();
        }
        System.out.println();
    }

    public void tambahkanKePesanan(MenuItem item) {
        pesanan.add(item);
        System.out.printf("Ditambahkan %s ke pesanan.\n", item.nama);
    }

    public double hitungTotal() {
        double total = 0;
        for (MenuItem item : pesanan) {
            total += item.getHarga();
        }
        return total;
    }

    public void terapkanDiskonKePesanan(double persentase) {
        for (MenuItem item : pesanan) {
            if (item instanceof DapatDidiskon) {
                DapatDidiskon itemDiskon = (DapatDidiskon) item;
                itemDiskon.terapkanDiskon(persentase);
            }
        }
    }

    public void tampilkanPesanan() {
        System.out.println("Pesanan Saat Ini:");
        for (MenuItem item : pesanan) {
            item.tampilkanInfo();
        }
        double totalHarga = hitungTotal();
        System.out.printf("Total Harga: $%.2f\n", totalHarga);
    }

    public static void main(String[] args) {
        // Membuat restoran
        Restaurant restaurant = new Restaurant();

        // Menambahkan item ke menu
        Makanan pizza = new Makanan("Pizza", 12.99, "Utama");
        Makanan salad = new Makanan("Salad", 8.49, "Pembuka");
        Makanan esKrim = new Makanan("Es Krim", 4.99, "Penutup");

        Minuman soda = new Minuman("Soda", 1.99, 0.5, "Soda");
        Minuman jusJeruk = new Minuman("Jus Jeruk", 2.49, 0.25, "Jus");
        Minuman bir = new Minuman("Bir", 3.99, 0.33, "Alkohol");

        // Menambahkan item ke menu restoran
        restaurant.tambahkanKeMenu(pizza);
        restaurant.tambahkanKeMenu(salad);
        restaurant.tambahkanKeMenu(esKrim);
        restaurant.tambahkanKeMenu(soda);
        restaurant.tambahkanKeMenu(jusJeruk);
        restaurant.tambahkanKeMenu(bir);

        // Menampilkan menu restoran
        restaurant.tampilkanMenu();

        // Menambahkan item ke pesanan
        restaurant.tambahkanKePesanan(pizza);
        restaurant.tambahkanKePesanan(soda);

        // Menampilkan pesanan saat ini
        restaurant.tampilkanPesanan();

        // Menerapkan diskon ke pesanan
        System.out.println("\nMenerapkan diskon 10% ke pesanan.");
        restaurant.terapkanDiskonKePesanan(10);

        // Menampilkan pesanan setelah diskon
        restaurant.tampilkanPesanan();
    }
}
