public class Campaign {

    // Campaign attributes
    private String startDate;
    private String endDate;
    private String itemType;
    private double discountRate;


    // Constructor
    public Campaign(String itemType, String startDate, String endDate, double discountRate) {

        this.itemType = itemType;
        this.startDate = startDate;
        this.endDate = endDate;
        this. discountRate = discountRate;
    }


    // Getters
    public String getItemType() { return itemType; }

    public String getStartDate() { return startDate; }

    public String getEndDate() { return endDate; }

    public double getDiscountRate() { return discountRate; }


    // Setters
    public void setStartDate(double discountRate) { this.discountRate = discountRate; }


    // Methods
    public String toString() {
        return "ItemType: " + itemType + " Start: " + startDate + " End: " + endDate + "DiscountRate: " + discountRate;
    }
}
