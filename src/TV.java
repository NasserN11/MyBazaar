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

    @Override
    public void displayItemInfo() {
        System.out.println("Type: TV");
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Max Volt: " + getMaxVolt() + " V.");
        System.out.println("Max Watt: " + getMaxWatt() + " W.");
        System.out.println("Screen size: " + screenSize + "\"");
    }
}