public class Person {

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
}
