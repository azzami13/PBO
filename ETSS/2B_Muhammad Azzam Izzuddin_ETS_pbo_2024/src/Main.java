import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try {
            FileReader fileReader = new FileReader("src/json_file.json");
            Delivery[] deliveries = gson.fromJson(fileReader, Delivery[].class);

            for (Delivery delivery : deliveries) {
                System.out.println(delivery);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (JsonIOException e) {
            System.out.println("Error IO saat membaca JSON: " + e.getMessage());
        } catch (JsonSyntaxException e) {
            System.out.println("Format JSON tidak valid: " + e.getMessage());
        }
    }
}
