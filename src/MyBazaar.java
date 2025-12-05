import javax.lang.model.util.ElementScanner6;
import java.util.ArrayList;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class MyBazaar {

    // Auto-generate ID for customer
    private int nextCustomerID = 1;

    // Attributes to store files data
    private ArrayList<Person> allUsers;
    private ArrayList<Item> allItems;
    private ArrayList<Campaign> allCampaigns;


    // Constructor
    public MyBazaar() {
        allUsers = new ArrayList<>();
        allItems = new ArrayList<>();
        allCampaigns = new ArrayList<>();
    }


    // Methods for loading files
    public void loadUsers(String fileName) {

        // Open file "users.txt"
        try {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        // Read file line-by-line
        String line;
        while ((line = br.readLine()) != null) {

            // Split line by tabs
            String[] parts = line.split("\t");

            // Check first part
            if (parts[0].equals("ADMIN")) {

                String name = parts[1];
                String email = parts[2];
                String dateOfBirth = parts[3];
                double salary = Double.parseDouble(parts[4]);
                String password = parts[5];

                Admin admin = new Admin(name, email, dateOfBirth, salary, password);
                allUsers.add(admin);
            }

            else if (parts[0].equals("CUSTOMER")) {

                String name = parts[1];
                String email = parts[2];
                String dateOfBirth = parts[3];
                double balance = Double.parseDouble(parts[4]);
                String password = parts[5];

                int customerID = nextCustomerID++;

                Customer customer = new Customer(name, email, dateOfBirth, customerID, password);
                customer.setBalance(balance);

                allUsers.add(customer);
            }

            else if (parts[0].equals("TECH")) {

                String name = parts[1];
                String email = parts[2];
                String dateOfBirth = parts[3];
                double salary = Double.parseDouble(parts[4]);
                boolean isSenior = Boolean.parseBoolean(parts[5]);

                Technician technician = new Technician(name, email, dateOfBirth, salary, isSenior);
                allUsers.add(technician);
            }
        }
        br.close();

        } catch (IOException e) {
            System.out.println("Error! (users.txt)");
        }
    }

    public void loadItems(String fileName) {

        // Open file "item.txt"
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            // Read file line-by-line
            String line;

            while ((line = br.readLine()) != null) {

                // Split line by tabs
                String[] parts = line.split("\t");


                if (parts[0].equals("DESKTOP")) {

                }
                else if (parts[0].equals("LAPTOP")) {

                }
                else if (parts[0].equals("TABLET")) {

                }
                else if (parts[0].equals("TV")) {

                }
                else if (parts[0].equals("SMARTPHONE")) {

                }
                else if (parts[0].equals("BOOK")) {

                }
                else if (parts[0].equals("CDDVD")) {

                }
                else if (parts[0].equals("HAIRCARE")) {

                }
                else if (parts[0].equals("SKINCARE")) {

                }
                else if (parts[0].equals("PERFUME")) {

                }

            }


            br.close();

        } catch (IOException E) {
            System.out.println("Error! (item.txt)");
        }

    }

    public void processCommands(String fileName);
}
