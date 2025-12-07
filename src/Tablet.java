public class Tablet extends Computer {

    // Tablet attributes
    private String dimensions;


    // Constructor
    public Tablet(int itemID, double price, int stock,
                  String manufacturer, String brand, int maxVolt, int maxWatt,
                  String operatingSystem, String CPU_Type, int RAM, int HDD,
                  String dimensions) {

        super(itemID, price, stock, "TABLET", manufacturer, brand, maxVolt, maxWatt, operatingSystem, CPU_Type, RAM, HDD);

        this.dimensions = dimensions;
    }


    // Getters
    public String getDimensions() { return dimensions; }


    // Methods
    public String toString() {
        return "Dimensions: " + dimensions;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Type: Tablet");
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Max Volt: " + getMaxVolt() + " V.");
        System.out.println("Max Watt: " + getMaxWatt() + " W.");
        System.out.println("Operating System: " + getOperatingSystem());
        System.out.println("CPU: " + getCPU_Type());
        System.out.println("RAM: " + getRAM() + " GB");
        System.out.println("HDD: " + getHDD() + " GB");
        System.out.println("Dimensions: " + dimensions);
    }
}
