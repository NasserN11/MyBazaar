public  abstract class Employee extends Person {

    // Employee attributes
    private double salary;


    // Constructor
    public Employee(String name, String email, String dateOfBirth,
                    double salary) {

        super(name, email, dateOfBirth);
        this.salary = salary;
    }


    // Getters
    public double getSalary() { return salary; }


    // Setters
    public void setSalary(double salary) { this.salary = salary; }


    // Methods
}
