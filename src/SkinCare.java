public class SkinCare extends Cosmetic {

    // SkinCare attributes
    private boolean isBabySensitive;


    // Constructor
    public SkinCare(int itemID, double price, int stock,
                   String manufacturer, String brand, String expirationDate, double weight, boolean isOrganic,
                   boolean isBabySensitive) {

        super(itemID, price, stock, "SkinCare", manufacturer, brand, expirationDate, weight, isOrganic);

        this.isBabySensitive = isBabySensitive;
    }


    // Getters
    public boolean getIsBabySensitive() { return isBabySensitive; }


    // Methods
    public String toString() {
        return "IsBabySensitive: " + isBabySensitive;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Type: SkinCare");
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Organic: " + (getIsOrganic() ? "Yes" : "No"));
        System.out.println("Expiration Date: " + getExpirationDate());
        System.out.println("Weight: " + getWeight() + " g.");
        System.out.println("Baby Sensitive: " + (isBabySensitive ? "Yes" : "No"));
    }
}
