public class WashingMachine extends Device {
    private String energyClass;
    private int capacity;
    private int spinSpeed;

    public WashingMachine() {

    }

    public WashingMachine(String code, String modelName, int year, String manufacturer, double price,int stock, String energyClass, int capacity, int spinSpeed) {
        super(code, modelName, year, manufacturer, price,stock);
        this.energyClass = energyClass;
        this.capacity = capacity;
        this.spinSpeed = spinSpeed;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public String toString() {
        return super.toString() + "\nEnergy class: " + energyClass + "\nCapacity: " + capacity + "\nSpin speed: " + spinSpeed + "\n---------------";
    }
}