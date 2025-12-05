public class Desktop extends Computer {

    // Desktop attributes
    private String boxColor;


    // Constructor
    public Desktop(int itemID, double price, int stock,
                   String manufacturer, String brand, int maxVolt, int maxWatt,
                   String operatingSystem, String CPU_Type, int RAM, int HDD,
                   String boxColor) {

        super(itemID, price, stock, "DESKTOP", manufacturer, brand, maxVolt, maxWatt, operatingSystem, CPU_Type, RAM, HDD);

        this.boxColor = boxColor;
    }


    // Getters
    public String getBoxColor() { return boxColor; }


    // Methods
    public String toString() {
        return "BoxColor: " + boxColor;
    }
}
