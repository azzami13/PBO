@author
public class Delivery {
    private status status;
    private servicesPackage servicePackage;
    private city city;
    private int weight;
    private int quantity;
    private int priceItem;
    private String productName;

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public servicesPackage getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(servicesPackage servicePackage) {
        this.servicePackage = servicePackage;
    }

    public city getCity() {
        return city;
    }

    public void setCity(city city) {
        this.city = city;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(int priceItem) {
        this.priceItem = priceItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
}
