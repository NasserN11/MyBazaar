public class Perfume extends Cosmetic {

    // Perfume attributes
    private int lastingDuration;


    // Constructor
    public Perfume(int itemID, double price, int stock,
                   String manufacturer, String brand, String expirationDate, double weight, boolean isOrganic,
                   int lastingDuration) {

        super(itemID, price, stock, manufacturer, brand, expirationDate, weight, isOrganic);

        this.lastingDuration = lastingDuration;
    }


    // Getters
    public int getLastingDuration() { return lastingDuration; }


    // Methods
    public String toString() {
        return "Lasting Duration: " + lastingDuration + " hours";
    }
}