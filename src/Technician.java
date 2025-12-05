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
}
