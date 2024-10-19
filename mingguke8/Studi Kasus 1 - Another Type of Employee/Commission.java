
public class Commission extends Hourly {
    private double totalSales;       
    private double commissionRate;   

    public Commission(String name, String address, String phone, String socSecNumber, double rate, double commissionRate) {
        super(name, address, phone, socSecNumber, rate);  
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;  
    }

    public void addSales(double sales) {
        totalSales += sales;
    }

    @Override
    public double pay() {
        double basePay = super.pay();  
        double commissionPay = totalSales * commissionRate;
        totalSales = 0;  
        return basePay + commissionPay;
    }

    @Override
    public String toString() {
        String result = super.toString(); 
        result += "\nTotal Sales: " + totalSales; 
        return result;
    }
}
