public class HairCare extends Cosmetic {

    // HairCare attributes
    private boolean isMedicated;


    // Constructor
    public HairCare(int itemID, double price, int stock,
                   String manufacturer, String brand, String expirationDate, double weight, boolean isOrganic,
                   boolean isMedicated) {

        super(itemID, price, stock, "HairCare", manufacturer, brand, expirationDate, weight, isOrganic);

        this.isMedicated = isMedicated;
    }


    // Getters
    public boolean getIsMedicated() { return isMedicated; }


    // Methods
    public String toString() {
        return "IsMedicated: " + isMedicated;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Type: HairCare");
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Organic: " + (getIsOrganic() ? "Yes" : "No"));
        System.out.println("Expiration Date: " + getExpirationDate());
        System.out.println("Weight: " + getWeight() + " g.");
        System.out.println("Medicated: " + (isMedicated ? "Yes" : "No"));
    }
}