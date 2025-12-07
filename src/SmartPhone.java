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

    @Override
    public void displayItemInfo() {
        System.out.println("Type: SmartPhone");
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Max Volt: " + getMaxVolt() + " V.");
        System.out.println("Max Watt: " + getMaxWatt() + " W.");
        System.out.println("Screen Type: " + screenType);
    }
}
