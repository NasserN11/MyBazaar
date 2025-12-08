import java.util.ArrayList;

public abstract class Employee extends Person {

    // Employee attributes
    private double salary;


    // Constructor
    public Employee(String name, String email, String dateOfBirth,
                    double salary) {

        super(name, email, dateOfBirth);
        this.salary = salary;
    }


    // Getters
    public double getSalary() {
        return salary;
    }


    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }


    // Methods
    public void displayStockAmount(ArrayList<Item> allItems) {

        String[] itemTypes = {"BOOK", "CDDVD", "DESKTOP", "LAPTOP", "TABLET",
                "TV", "SMARTPHONE", "HAIRCARE", "PERFUME", "SKINCARE"};

        for (String type : itemTypes) {
            int count = 0;
            for (Item item : allItems) {
                if (item.getItemType().equalsIgnoreCase(type)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(type + " : " + count);
            }
        }
    }

    public void listAvailableItems(ArrayList<Item> allItems) {

        for (Item item : allItems) {
            item.displayItemInfo();
            System.out.println("---");
        }
    }

    public void displayVIPCustomers(ArrayList<Person> allUsers) {

        boolean foundVIP = false;

        for (Person p : allUsers) {
            if (p instanceof Customer) {
                Customer cust = (Customer) p;
                if (cust.getStatus() == Customer.GOLDEN) {
                    System.out.println(cust.toString());
                    foundVIP = true;
                }
            }
        }

        if (!foundVIP) {
            System.out.println("No VIP customers found.");
        }
    }
}

