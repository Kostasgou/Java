public class Refrigerator extends Device {
    private String type;
    private String energyClass;
    private int storageCapacity;
    private int freezerCapacity;

    public Refrigerator(String code, String modelName, int year, String manufacturer, double price,int stock, String type, String energyClass, int storageCapacity, int freezerCapacity) {
        super(code, modelName, year, manufacturer, price,stock);
        this.type = type;
        this.energyClass = energyClass;
        this.storageCapacity = storageCapacity;
        this.freezerCapacity = freezerCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }
    
    public String toString() {
        return super.toString() + "\nType: " + type + "\nEnergy class: " + energyClass + "\nStorage capacity: " + storageCapacity + "\nFreezer capacity: " + freezerCapacity + "\n---------------";
    }
}