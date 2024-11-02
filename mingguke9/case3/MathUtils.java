public class MathUtils {
    // -------------------------------------------------------------
    // Mengembalikan faktorial dari argumen yang diberikan
    // -------------------------------------------------------------
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak didefinisikan untuk bilangan negatif: " + n);
        } else if (n > 16) {
            throw new IllegalArgumentException("Faktorial terlalu besar untuk dihitung (harus <= 16): " + n);
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}

