public abstract class Item {

    // Item attributes
    private String itemType;
    private int itemID;
    private double price;
    private int stock;


    // Constructor
    public Item(int itemID, double price, int stock, String itemType) {
        this.itemID = itemID;
        this.price = price;
        this.stock = stock;
        this.itemType = itemType;
    }


    // Getters
    public int getItemID() { return itemID; }

    public double getPrice() { return price; }

    public int getStock() { return stock; }

    public String getItemType() { return itemType; }


    // Setters
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }


    // Methods
    public String toString() {
        return "Item ID: " + itemID + " Price: $" + price + " Stock: " + stock;
    }

    public abstract void displayItemInfo();
}
