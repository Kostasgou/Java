public class Camera extends Device {
    private String type;
    private int megapixels;
    private int opticalZoom;
    private int digitalZoom;
    private double screenSize;

    public Camera(String code, String modelName, int year, String manufacturer, double price,int stock, String type, int megapixels, int opticalZoom, int digitalZoom, double screenSize) {
        super(code, modelName, year, manufacturer, price,stock);
        this.type = type;
        this.megapixels = megapixels;
        this.opticalZoom = opticalZoom;
        this.digitalZoom = digitalZoom;
        this.screenSize = screenSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public int getOpticalZoom() {
        return opticalZoom;
    }

    public void setOpticalZoom(int opticalZoom) {
        this.opticalZoom = opticalZoom;
    }

    public int getDigitalZoom() {
        return digitalZoom;
    }

    public void setDigitalZoom(int digitalZoom) {
        this.digitalZoom = digitalZoom;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String toString() {
        return super.toString() + "\nType: " + type + "\nMegapixels: " + megapixels + "\nOptical zoom: " + opticalZoom + "\nDigital zoom: " + digitalZoom + "\nScreen size: " + screenSize + "\n---------------";
    }
}