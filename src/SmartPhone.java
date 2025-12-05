public class SmartPhone extends Electronic {

    // SmartPhone attributes
    private String screenType;


    // Constructor
    public SmartPhone(int itemID, double price, int stock,
                      String manufacturer, String brand, int maxVolt, int maxWatt,
                      String screenType) {

        super(itemID, price, stock, "SmartPhone", manufacturer, brand, maxVolt, maxWatt);

        this.screenType = screenType;
    }


    // Getters
    public String getScreenType() { return screenType; }


    // Methods
    public String toString() {
        return "ScreenType; " + screenType;
    }
}
