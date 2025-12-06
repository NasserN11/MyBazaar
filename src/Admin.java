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
}
