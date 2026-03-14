public class Console extends Device {
    private String type;
    private String processor;
    private String graphics;
    private String sound;
    private int storageCapacity;

    public Console(String code, String modelName, int year, String manufacturer, double price,int stock, String type, String processor, String graphics, String sound, int storageCapacity) {
        super(code, modelName, year, manufacturer, price,stock);
        this.type = type;
        this.processor = processor;
        this.graphics = graphics;
        this.sound = sound;
        this.storageCapacity = storageCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String toString() {
        return super.toString() + "\nType: " + type + "\nProcessor: " + processor + "\nGraphics: " + graphics + "\nSound: " + sound + "\nStorage Capacity: " + storageCapacity + "\n---------------";
    }
}