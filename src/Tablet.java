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
}
