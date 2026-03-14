public class Device {
    private String code;
    private String modelName;
    private int year;
    private String manufacturer;
    private double price;
    private int stock;

    public Device() {

    }

    public Device(String code, String modelName, int year, String manufacturer, double price,int stock) {
        this.code = code;
        this.modelName = modelName;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price;
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock){
        this.stock=stock;
    }

    public int getStock(){
        return stock;
    }

    public String toString() {
        return "--------------- " + "\nCode:" + code + "\nModel Name:" + modelName + "\nYear:" + year + "\nManufacturer:" + manufacturer + "\nPrice:" + price + "\nStock:" + stock;
       
    }
}