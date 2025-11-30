public abstract class Item {

    // Item attributes
    private int itemID;
    private double price;
    private int stock;


    // Constructor
    public Item(int itemID, double price, int stock) {
        this.itemID = itemID;
        this.price = price;
        this.stock = stock;
    }


    // Getters
    public int getItemID() { return itemID; }

    public double getPrice() { return price; }

    public int getStock() { return stock; }


    // Setters
    public void setStock(int stock) {
        this.stock = stock;
    }


    // Methods
    public String toString() {
        return "Item ID: " + itemID + " Price: $" + price + " Stock: " + stock;
    }
}
