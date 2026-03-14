import java.util.Arrays;

public class BluRayDVDPlayer extends Device {
    private String type;
    private String resolution;
    private String[] formats;

    public BluRayDVDPlayer(String code, String modelName, int year, String manufacturer, double price,int stock, String type, String resolution, String[] formats) {
        super(code, modelName, year, manufacturer, price,stock);
        this.type = type;
        this.resolution = resolution;
        this.formats = formats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String[] getFormats() {
        return formats;
    }

    public void setFormats(String[] formats) {
        this.formats = formats;
    }

    public String toString() {
        return super.toString() + "\nType: " + type + "\nResolution: " + resolution + "\nFormats: " + Arrays.toString(formats) + "\n---------------" ;
    }
}