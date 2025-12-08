import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer extends Person {

    // Status constants
    public static final int CLASSIC = 0;
    public static final int SILVER = 1;
    public static final int GOLDEN = 2;

    public static final double SILVER_THRESHOLD = 1000.0;
    public static final double GOLDEN_THRESHOLD = 5000.0;


    public static final double SILVER_DISCOUNT_RATE = 0.10;
    public static final double GOLDEN_DISCOUNT_RATE = 0.15;


    // Customer attributes
    private int customerID;
    private String password;
    private double balance;
    private int status;
    private ArrayList<Item> shoppingCart;
    private ArrayList<Order> orderHistory;

    private double totalSpent = 0.0;


    // Constructor
    public Customer(String name, String email, String dateOfBirth, int customerID, String password) {

        super(name, email, dateOfBirth);

        this.customerID = customerID;
        this.password = password;
        this.balance = 0.0;
        this.status = CLASSIC;
        this.shoppingCart = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }


    // Getters
    public int getCustomerID() {
        return customerID;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public int getStatus() {
        return status;
    }

    public double getTotalSpent() { return totalSpent; }


    // Setters
    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTotalSpent(double totalSpent) { this.totalSpent = totalSpent; }


    // Methods
    public String toString() {
        String statusInText;
        if (status == 0) {
            statusInText = "CLASSIC";
        }
        else if (status == 1) {
            statusInText = "SILVER";
        }
        else {
            statusInText = "GOLDEN";
        }

        return "Customer name: " + getName() +
                " ID: " + customerID +
                " e-mail: " + getEmail() +
                " Date of Birth: " + getDateOfBirth() +
                " Status: " + statusInText;
    }


    public void changePassword(String oldPIN, String newPIN) {
        if (this.password.equals(oldPIN)) {
            this.password = newPIN;
            System.out.println("The password has been successfully changed.");
        }
        else {
            System.out.println("The given password does not match the current password. Please try again.");
        }
    }


    public void updateBalance(double amount) {
        this.balance += amount;
    }


    public void clearCart() {
        if (!shoppingCart.isEmpty()) {
            shoppingCart.clear();
            System.out.println("The cart has been emptied.");
        }
        else {
            System.out.println("The cart is already empty.");
        }
    }


    public void addToCart(Item item) {
        if (item.getStock() > 0) {
            shoppingCart.add(item);
            System.out.println("The item " + item.getItemType() + " has been successfully added to your cart.");
        }
        else {
            System.out.println("We are sorry. The item is temporarily unavailable.");
        }
    }


    public void placeOrder(String password, ArrayList<Campaign> activeCampaign) {


        // Cart empty check
        if (shoppingCart.isEmpty()) {
            System.out.println("You should add some items to your cart before order request!");
            return;
        }

        // Password check
        if (!this.password.equals(password)) {
            System.out.println("Order could not be placed. Invalid password.");
            return;
        }

        // Calculate total
        double subTotal = 0;

        for (Item item : shoppingCart) {
            double itemPrice = item.getPrice();

            // Check for campaign discount
            for (Campaign campaign : activeCampaign) {
                if(campaign.getItemType().equals(item.getItemType())) {
                    double discountRate = campaign.getDiscountRate() / 100;

                    itemPrice = itemPrice * (1 - discountRate);

                }
            }
            subTotal += itemPrice;
        }

        // Apply membership discount
        double total = subTotal;
        if (status == SILVER) {
            total = subTotal * (1 - SILVER_DISCOUNT_RATE);
        }
        else if (status == GOLDEN) {
            total = subTotal * (1 - GOLDEN_DISCOUNT_RATE);
        }

        // Check balance
        if (balance < total) {
            System.out.println("Order could not be placed. Inufficient funds.");
            return;
        }

        // Process order
        balance -= total;
        totalSpent += total;

        // Decrease stock
        for (Item item : shoppingCart) {
            item.setStock(item.getStock() - 1);
        }

        // Create and save order
        String currentDate = "Current Date";
        Order order = new Order(customerID, shoppingCart, total, currentDate);
        orderHistory.add(order);
        
        // Check status upgrade
        checkAndUpdateStatus();

        // Clear cart
        shoppingCart.clear();


        System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
    }


    public void viewCampaigns(ArrayList<Campaign> allCampaigns) {

        if(allCampaigns.isEmpty()) {
            System.out.println("No campaign has been created so far!");
            return;
        }

        System.out.println("Active campaigns:");
        for (Campaign campaign : allCampaigns) {
            System.out.println(campaign.getDiscountRate() + "% sale of " + campaign.getItemType() + " until " + campaign.getEndDate());
        }
    }


    private void checkAndUpdateStatus() {
        if (totalSpent >= GOLDEN_THRESHOLD && status != GOLDEN) {
            status = GOLDEN;
            System.out.println("Congratulations! You have been upgraded to a GOLDEN MEMBER! You have earned\n" +
                    "a discount of 15% on all purchases.");
        }
        else if (totalSpent >= SILVER_THRESHOLD && status != SILVER) {
            status = SILVER;
            System.out.println("Congratulations! You have been upgraded to a SILVER MEMBER! You have earned\n" +
                    "a discount of 10% on all purchases.");
        }
        else if (status == CLASSIC) {
            double amountNeeded = SILVER_THRESHOLD - totalSpent;
            System.out.println("You need to spend " + amountNeeded + " more TL to become a SILVER MEMBER.");
        }
        else if (status == SILVER) {
            double amountNeeded = GOLDEN_THRESHOLD - totalSpent;
            System.out.println("You need to spend " + amountNeeded + " TL to become a GOLDEN MEMBER");
        }
    }
}