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
}