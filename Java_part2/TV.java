public class TV extends Device {
    private String type;
    private double screenSize;
    private String resolution;
    private String ports;

    public TV() {

    }
    
    public TV(String code, String modelName, int year, String manufacturer, double price,int stock, String type, double screenSize, String resolution, String ports) {
        super(code, modelName, year, manufacturer, price,stock);
        this.type = type;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.ports = ports;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public String toString() {
        return super.toString() + "\nType: " + type + "\nScreen size: " + screenSize + "\nResolution: " + resolution + "\nPorts: " + ports + "\n---------------";
    }
}