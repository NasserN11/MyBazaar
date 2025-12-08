public class Perfume extends Cosmetic {

    // Perfume attributes
    private int lastingDuration;


    // Constructor
    public Perfume(int itemID, double price, int stock,
                   String manufacturer, String brand, String expirationDate, double weight, boolean isOrganic,
                   int lastingDuration) {

        super(itemID, price, stock, "PERFUME", manufacturer, brand, expirationDate, weight, isOrganic);

        this.lastingDuration = lastingDuration;
    }


    // Getters
    public int getLastingDuration() { return lastingDuration; }


    // Methods
    public String toString() {
        return "Lasting Duration: " + lastingDuration + " hours";
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Type: Perfume");
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Organic: " + (getIsOrganic() ? "Yes" : "No"));
        System.out.println("Expiration Date: " + getExpirationDate());
        System.out.println("Weight: " + getWeight() + " g.");
        System.out.println("Lasting Duration: " + lastingDuration + " hours");
    }
}
