public class HairCare extends Cosmetic {

    // HairCare attributes
    private boolean isMedicated;


    // Constructor
    public HairCare(int itemID, double price, int stock,
                   String manufacturer, String brand, String expirationDate, double weight, boolean isOrganic,
                   boolean isMedicated) {

        super(itemID, price, stock, manufacturer, brand, expirationDate, weight, isOrganic);

        this.isMedicated = isMedicated;
    }


    // Getters
    public boolean getIsMedicated() { return isMedicated; }


    // Methods
    public String toString() {
        return "IsMedicated: " + isMedicated;
    }
}