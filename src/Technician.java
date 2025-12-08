import java.util.ArrayList;

public class Technician extends Employee {

    // Technician attributes
    private boolean isSenior;


    // Constructor
    public Technician(String name, String email, String dateOfBirth, double salary, boolean isSenior) {

        super(name, email, dateOfBirth, salary);

        this.isSenior = isSenior;
    }


    // Getters
    public boolean getIsSenior() { return isSenior; }


    // Methods
    public void displayOrders(ArrayList<Person> allUsers) {

        if (!isSenior) {
            System.out.println(this.getName() + " is not authorized to display orders!");
            return;
        }

        System.out.println("Order History:");
        for (Person p : allUsers) {
            if (p instanceof Customer) {
                Customer customer = (Customer) p;
                customer.displayOrderHistory();
            }
        }
    }


    public void displayItemInfo(Item item) {
        item.displayItemInfo();
    }


    public Item addItem(String itemType, double price, int stock, String[] itemData) {


        System.out.println("Item of type " + itemType + " created by technician");
        return null;
    }


}
