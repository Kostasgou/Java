import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sale {
    private static int saleCount = 0;
    private int saleCode;
    private Device device;
    private String customerName;
    private String customerPhone;
    private LocalDate saleDate;
    private double totalCost;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    public Sale() {
        
    }


    public Sale(Device device, String customerName, String customerPhone, double totalCost) {
        this.saleCode = ++saleCount;
        this.device = device;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.saleDate = LocalDate.now();
        this.totalCost = totalCost;
    }

    public int getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(int saleCode) {
        this.saleCode = saleCode;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getSaleDate() {
        return saleDate.format(formatter);
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String toString() {
        return "Sale Code: " + saleCode + "\nDevice: " + device.getModelName() + "\nCustomer Name: " + customerName + "\nCustomer Phone: " + customerPhone + "\nSale Date: " + saleDate.format(formatter) + "\nTotal Cost: " +String.format("%10.2f",totalCost) + "\n---------------";
    }
}