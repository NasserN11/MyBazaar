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
}
