import java.util.Scanner;
import java.util.StringTokenizer;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String newStr = s.replaceAll("'", " ");
        StringTokenizer tokens = new StringTokenizer(newStr);
        int countToken = tokens.countTokens();

        System.out.println(countToken);

        for (int i = 0; i < countToken; i++) {
            System.out.println(tokens.nextToken());
        }
    }
}