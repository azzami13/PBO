import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Buat objek product dengan stok 10
        Product product = new Product("Laptop", 10000000, 10);

        // Buat objek sales
        Sales sales = new Sales(product);

        // Lakukan penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // Lakukan restock produk
        sales.restockProduct(10);

        // Lakukan memperbarui harga produk
        sales.updateProductPrice(12000000);

        // Coba lakukan memperbarui harga produk dengan nilai negatif
        sales.updateProductPrice(-5000000);  // Harga tidak valid!
    }
}
