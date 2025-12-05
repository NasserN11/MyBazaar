public class Cosmetic extends Item {

    // Cosmetic attributes
    private String manufacturer;
    private String brand;
    private String expirationDate;
    private double weight;
    private boolean isOrganic;

    // Constructors
    public Cosmetic(int itemID, double price, int stock, String itemType, String manufacturer, String brand, String expirationDate, double weight, boolean isOrganic) {

        super(itemID, price, stock, itemType);

        this.manufacturer = manufacturer;
        this.brand = brand;
        this.expirationDate = expirationDate;
        this.weight = weight;
        this.isOrganic = isOrganic;
    }


    // Getters
    public String getManufacturer() { return manufacturer; }

    public String getBrand() { return brand; }

    public String getExpirationDate() { return expirationDate; }

    public double getWeight() { return weight; }

    public boolean getIsOrganic() { return isOrganic; }


    // Methods
    public String toString() {
        return "Manufacturer: " + manufacturer + " Brand: " + brand + " Expiration Date: " + expirationDate + " isOrganic: " + isOrganic;
    }
}