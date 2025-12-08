public abstract class Electronic extends Item {

    // Electronic attributes
    private String manufacturer;
    private String brand;
    private int maxVolt;
    private int maxWatt;


    // Constructor
    public Electronic(int itemID, double price, int stock, String itemType, String manufacturer, String brand, int maxVolt, int maxWatt) {

        super(itemID, price, stock, itemType);

        this.manufacturer = manufacturer;
        this.brand = brand;
        this.maxVolt = maxVolt;
        this.maxWatt = maxWatt;
    }


    // Getters
    public String getManufacturer() { return manufacturer; }

    public String getBrand() { return brand; }

    public int getMaxVolt() { return maxVolt; }

    public int getMaxWatt() { return maxWatt; }


    // Methods
    public String toString() {
        return "Manufacturer: " + manufacturer + " Brand: " + brand + " Max Volt: " + maxVolt + " Max Watt: " + maxWatt;
    }
}
