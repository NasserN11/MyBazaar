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

    @Override
    public void displayItemInfo() {
        System.out.println("Type: Desktop");
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
        System.out.println("Box Color: " + boxColor);
    }
}
