import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    private static int orderCount = 0;
    private int orderCode;
    private Device device;
    private String customerName;
    private String customerPhone;
    private LocalDate orderDate;
    private LocalDate expectedArrivalDate;
    private double totalCost;
    private String status;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Order() {

    }

    public Order(Device device, String customerName, String customerPhone, LocalDate expectedArrivalDate, double totalCost) {
        this.orderCode = ++orderCount;
        this.device = device;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.orderDate = LocalDate.now();
        this.expectedArrivalDate = expectedArrivalDate;
        this.totalCost = totalCost;
        this.status = "Expected";
    }

    public Order(LocalDate expectedArrivalDate) {
        this.expectedArrivalDate = expectedArrivalDate;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
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

    public String getOrderDate() {
        return orderDate.format(formatter);
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getExpectedArrivalDate() {
        return expectedArrivalDate.format(formatter);
    }

    public void setExpectedArrivalDate(LocalDate expectedArrivalDate) {
        this.expectedArrivalDate = expectedArrivalDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getExecuteOrder() {
        return status;
    } 

    public void setExecuteOrder(String status) {
        this.status = status;
    }

    public String toString() {
        return "Order Code: " + orderCode + "\n" + "Device:"+device.getModelName() + "\nCustomer Name: " + customerName + "\nCustomer Phone: " + customerPhone + "\nOrder Date: " + getOrderDate() + "\nExpected Arrival Date: " + getExpectedArrivalDate() + "\nTotal Cost: " +String.format("%10.2f",totalCost) + "\nStatus: " + status + "\n---------------" ;
    }
}