public class Computer extends Electronic {

    // Computer attributes
    private String operatingSystem;
    private String CPU_Type;
    private int RAM;
    private int HDD;


    // Constructor
    public Computer(int itemID, double price, int stock, String itemType,
                    String manufacturer, String brand, int maxVolt, int maxWatt,
                    String operatingSystem, String CPU_Type, int RAM, int HDD) {

        super(itemID, price, stock, itemType, manufacturer, brand, maxVolt, maxWatt);

        this.operatingSystem = operatingSystem;
        this.CPU_Type = CPU_Type;
        this.RAM = RAM;
        this.HDD = HDD;
    }


    // Getters
    public String getOperatingSystem() { return operatingSystem; }

    public String getCPU_Type() { return CPU_Type; }

    public int getRAM() { return RAM; }

    public int getHDD() { return HDD; }


    // Methods
    public String toString() {
        return "OperatingSystem: " + operatingSystem + " CPU: " + CPU_Type + " RAM: " + RAM + " HDD: " + HDD;
    }
}
