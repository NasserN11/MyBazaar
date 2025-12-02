import java.util.ArrayList;
import java.util.Date;

public class Order {

    // Order attributes
    private String orderDate;
    private double totalCost;
    private ArrayList<Item> purchasedItems;
    private int customerID;


    // Constructor
    public Order(int customerID, ArrayList<Item> purchasedItems, double totalCost, String orderDate) {
        this.customerID = customerID;
        this.purchasedItems = purchasedItems;
        this.totalCost = totalCost;
        this.orderDate = orderDate;
    }


    // Getters
    public String getOrderDate() { return orderDate; }

    public double getTotalCost() { return totalCost; }

    public ArrayList<Item> getPurchasedItems() { return purchasedItems; }

    public  int getCustomerID() { return customerID; }


    // Methods
    public String toString() {
        return "CustomerID: " + customerID + " PurchasedItems: " + purchasedItems + " TotalCost: " + totalCost + " OrderDate: " + orderDate;
    }


    public void displayOrderInfo() {
        System.out.println("Order Date: " + orderDate);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Purchased Items: " + purchasedItems.size());
    }
}