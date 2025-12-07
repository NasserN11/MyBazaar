public class Laptop extends Computer {

    // Laptop attributes
    boolean has_HDMI_Support;


    // Constructor
    public Laptop(int itemID, double price, int stock,
                  String manufacturer, String brand, int maxVolt, int maxWatt,
                  String operatingSystem, String CPU_Type, int RAM, int HDD,
                  boolean has_HDMI_Support) {

        super(itemID, price, stock, "LAPTOP", manufacturer, brand, maxVolt, maxWatt, operatingSystem, CPU_Type, RAM, HDD);

        this.has_HDMI_Support = has_HDMI_Support;
    }


    // Getters
    public boolean getHas_HDMI_Support() { return has_HDMI_Support; }


    // Methods
    public String toString() {
        return "Has_HDMI_Support: " + has_HDMI_Support;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Type: Laptop");
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
        System.out.println("HDMI Support: " + (has_HDMI_Support ? "Yes" : "No"));
    }
}
