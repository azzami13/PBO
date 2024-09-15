public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 10000000, 10);
        Sales sales = new Sales(product);

        // Penjualan produk
        sales.sellProduct(5);

        // Restock produk
        sales.restockProduct(10);

        // Memperbarui harga produk
        sales.updateProductPrice(12000000);

        // Uji harga negatif
        sales.updateProductPrice(-5000000);
    }
}
