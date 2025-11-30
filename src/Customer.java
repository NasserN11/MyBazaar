import java.util.ArrayList;

public class Customer extends Person {

    // Status constants
    public static final int CLASSIC = 0;
    public static final int SILVER = 1;
    public static final int GOLDEN = 2;


    // Customer attributes
    private int customerID;
    private String password;
    private double balance;
    private int status;
    private ArrayList<Item> shoppingCart;
    private ArrayList<Order> orderHistory;


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


    // Setters
    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


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

        return "Customer name: " + getName() + "ID: " + customerID + " Balance: $" + balance + " Status: " + statusInText;
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
}
