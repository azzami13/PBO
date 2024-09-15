import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input string
        String s = scanner.nextLine();
        
        // Memisahkan string berdasarkan karakter non-alfabetik menggunakan regex
        String[] tokens = s.split("[^a-zA-Z]+");
        
        // Mencetak jumlah token
        System.out.println(tokens.length);
        
        // Mencetak setiap token pada baris baru
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
        
        scanner.close();
    }
}
