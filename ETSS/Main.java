import com.google.gson.Gson;
import java.io.*;
import java.util.*;
import java.io.FileReader;
 
 @author
 public class Main {
@param args the command line arguments
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
        
        try {
            Delivery[] delivery = gson.fromJson(new FileReader("data.json"),Delivery[].class);
            
            double totalCost = 0.0;
            
            System.out.printf("%-30s | %-10s | %-10s | %-20s | %-20s | %-25s | %-15s | %-15s | %-10s | %-10s | %-15s\n", 
                "Product Name", "Quantity", "Weight", "Origin", "Destination", "Service Package", 
                "Service Value", "Price per Item", "Total", "Shipping", "Grand Total");

            for (Delivery d : delivery) {
                double productTotal = d.getPriceItem() * d.getQuantity();
                double shippingCost = d.getServicePackage().getValue();
                double grandTotal = productTotal + shippingCost;
                
                totalCost += grandTotal;

                System.out.printf("%-30s | %-10s | %-10s | %-20s | %-20s | %-25s | %-15s | %-15s | %-10s | %-10s | %-15s\n", 
                    d.getProductName(), d.getQuantity(), d.getWeight(), d.getCity().getOrigin(),
                    d.getCity().getDestination(), d.getServicePackage().getService(), 
                    d.getServicePackage().getValue(), d.getPriceItem(), 
                    productTotal, shippingCost, grandTotal);
            }

            System.out.println("\nTotal Cost: " + totalCost);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
