public abstract class Person {

    // Private attributes
    private String name;
    private String email;
    private String dateOfBirth;


    // Constructor
    public Person(String name, String email, String dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }


    // Getters
    public String getName() { return name; }

    public String getEmail() { return email; }

    public String getDateOfBirth() { return dateOfBirth; }


    // Methods
    public String toString() {
        return "name: " + name + ", email: " + email + "date of birth: " + dateOfBirth;
    }

    public void displayPersonalData() {
        System.out.println("name: " + name);
        System.out.println("e-mail: " + email);
        System.out.println("date of birth: " + dateOfBirth);
    }
}