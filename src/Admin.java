import java.util.ArrayList;

public class Admin extends Employee {

    // Admin attributes
    private String password;


    // Constructor
    public Admin(String name, String email, String dateOfBirth, double salary,
                 String password) {

        super(name, email, dateOfBirth, salary);

        this.password = password;
    }


    // Getters
    public String getPassword() { return password; }


    // Setters
    public void setPassword(String password) {
        this.password = password;
    }


    // Methods
    public String toString() {
        return "Password: " + password;
    }

    @Override
    public void displayPersonalData() {
        System.out.println("Admin name: " + getName());
        System.out.println("Admin e-mail: " + getEmail());
        System.out.println("Admin date of birth: " + getDateOfBirth());
    }


    public Customer addCustomer(String name, String email, String dateOfBirth,
                                int customerID, double initialBalance, String password) {
        //Create Customer object
        Customer customer = new Customer(name, email, dateOfBirth, customerID, password);
        customer.setBalance(initialBalance);
        return customer;
    }


    public Campaign launchCampaign(String itemType, String startDate,
                                   String endDate, double discountRate) {

        // validation
        if (discountRate > 50.0) {
            System.out.println("Discount rate exceeds maximum of 50%");
            return null;
        }

        Campaign campaign = new Campaign(itemType, startDate, endDate, discountRate);
        System.out.println("Campaign created for " + itemType);
        return campaign;
    }

    public Admin addAdmin(String name, String email, String dateOfBirth,
                          double salary, String password) {
        return new Admin(name, email, dateOfBirth, salary, password);
    }

    public Technician addTechnician(String name, String email, String dateOfBirth,
                                    double salary, boolean isSenior) {
        return new Technician(name, email, dateOfBirth, salary, isSenior);
    }

    public void displayCustomerData(Customer customer) {
        System.out.println(customer.toString());
    }
    public void displayAllCustomers(ArrayList<Person> allUsers) {

        for (Person p : allUsers) {
            if (p instanceof Customer) {
                System.out.println(p.toString());
            }
        }
    }

}
