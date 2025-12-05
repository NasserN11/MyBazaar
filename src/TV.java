public class TV extends Electronic {

    // TV attributes
    private double screenSize;


    // Constructor
    public TV(int itemID, double price, int stock,
              String manufacturer, String brand, int maxVolt, int maxWatt,
              double screenSize) {

        super(itemID, price, stock, "TV", manufacturer, brand, maxVolt, maxWatt);

        this.screenSize = screenSize;
    }


    // Getters
    public double getScreenSize() {
        return screenSize;
    }


    // Methods
    public String toString() {
        return " ScreenSize: " + screenSize;
    }
}