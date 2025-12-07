import javax.lang.model.util.ElementScanner6;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyBazaar {

    // Auto-generate ID for customer and item
    private int nextCustomerID = 1;
    private int nextItemID = 1;

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
            String[] parts = line.split("\\s+");

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
            System.out.println("ERROR loading users: ");
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

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 0;
                    String manufacturer = parts[2];
                    String brand = parts[3];
                    int maxVolt = Integer.parseInt(parts[4]);
                    int maxWatt = Integer.parseInt(parts[5]);
                    String operatingSystem = parts[6];
                    String CPU_Type = parts[7];
                    int RAM = Integer.parseInt(parts[8]);
                    int HDD = Integer.parseInt(parts[9]);
                    String boxColor = parts[10];

                    Desktop desktop = new Desktop(itemID, price, stock, manufacturer, brand, maxVolt, maxWatt, operatingSystem, CPU_Type, RAM, HDD, boxColor);

                    allItems.add(desktop);
                }

                else if (parts[0].equals("LAPTOP")) {

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 0;
                    String manufacturer = parts[2];
                    String brand = parts[3];
                    int maxVolt = Integer.parseInt(parts[4]);
                    int maxWatt = Integer.parseInt(parts[5]);
                    String operatingSystem = parts[6];
                    String CPU_Type = parts[7];
                    int RAM = Integer.parseInt(parts[8]);
                    int HDD = Integer.parseInt(parts[9]);
                    boolean has_HDMI_Support = Boolean.parseBoolean(parts[10]);

                    Laptop laptop = new Laptop(itemID, price, stock, manufacturer, brand, maxVolt, maxWatt, operatingSystem, CPU_Type, RAM, HDD, has_HDMI_Support);
                    allItems.add(laptop);
                }

                else if (parts[0].equals("TABLET")) {

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 0;
                    String manufacturer = parts[2];
                    String brand = parts[3];
                    int maxVolt = Integer.parseInt(parts[4]);
                    int maxWatt = Integer.parseInt(parts[5]);
                    String operatingSystem = parts[6];
                    String CPU_Type = parts[7];
                    int RAM = Integer.parseInt(parts[8]);
                    int HDD = Integer.parseInt(parts[9]);
                    String dimensions = parts[10];

                    Tablet tablet = new Tablet(itemID, price, stock, manufacturer, brand, maxVolt, maxWatt, operatingSystem, CPU_Type, RAM, HDD, dimensions);
                    allItems.add(tablet);
                }

                else if (parts[0].equals("TV")) {

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 10;
                    String manufacturer = parts[2];
                    String brand = parts[3];
                    int maxVolt = Integer.parseInt(parts[4]);
                    int maxWatt = Integer.parseInt(parts[5]);
                    double screenSize = Double.parseDouble(parts[6]);

                    TV tv = new TV(itemID, price, stock, manufacturer, brand, maxVolt, maxWatt, screenSize);
                    allItems.add(tv);
                }

                else if (parts[0].equals("SMARTPHONE")) {

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 10;
                    String manufacturer = parts[2];
                    String brand = parts[3];
                    int maxVolt = Integer.parseInt(parts[4]);
                    int maxWatt = Integer.parseInt(parts[5]);
                    String screenType = parts[6];

                    SmartPhone smartPhone = new SmartPhone(itemID, price, stock, manufacturer, brand, maxVolt, maxWatt, screenType);
                    allItems.add(smartPhone);
                }

                else if (parts[0].equals("BOOK")) {

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 10;
                    String releaseDate = parts[2];
                    String coverTitle = parts[3];
                    String publisher = parts[4];
                    String author = parts[5];
                    int numberOfPages = Integer.parseInt(parts[6]);

                    Book book = new Book(itemID, price, stock, releaseDate, coverTitle, publisher, author, numberOfPages);
                    allItems.add(book);
                }

                else if (parts[0].equals("CDDVD")) {

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 10;
                    String releaseDate = parts[2];
                    String coverTitle = parts[3];
                    String composer = parts[4];
                    String songs = parts[5];

                    CD_DVD cd_dvd = new CD_DVD(itemID, price, stock, releaseDate, coverTitle, composer, songs);
                    allItems.add(cd_dvd);
                }

                else if (parts[0].equals("HAIRCARE")) {

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 10;
                    String manufacturer = parts[2];
                    String brand = parts[3];
                    String expirationDate = parts[5];
                    double weight = Double.parseDouble(parts[6]);
                    boolean isOrganic = Boolean.parseBoolean(parts[4]);
                    boolean isMedicated = Boolean.parseBoolean(parts[7]);

                    HairCare hairCare = new HairCare(itemID, price, stock, manufacturer, brand, expirationDate, weight, isOrganic, isMedicated);
                    allItems.add(hairCare);

                }
                else if (parts[0].equals("SKINCARE")) {

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 10;
                    String manufacturer = parts[2];
                    String brand = parts[3];
                    String expirationDate = parts[5];
                    double weight = Double.parseDouble(parts[6]);
                    boolean isOrganic = Boolean.parseBoolean(parts[4]);
                    boolean isBabySensitive = Boolean.parseBoolean(parts[7]);

                    SkinCare skinCare = new SkinCare(itemID, price, stock, manufacturer, brand, expirationDate, weight, isOrganic, isBabySensitive);
                    allItems.add(skinCare);

                }

                else if (parts[0].equals("PERFUME")) {

                    int itemID = nextItemID++;
                    double price = Double.parseDouble(parts[1]);
                    int stock = 10;
                    String manufacturer = parts[2];
                    String brand = parts[3];
                    String expirationDate = parts[5];
                    double weight = Double.parseDouble(parts[6]);
                    boolean isOrganic = Boolean.parseBoolean(parts[4]);
                    int lastingDuration = Integer.parseInt(parts[7]);

                    Perfume perfume = new Perfume(itemID, price, stock, manufacturer, brand, expirationDate, weight, isOrganic, lastingDuration);
                    allItems.add(perfume);

                }
            }


            br.close();

        } catch (IOException e) {
            System.out.println("Error! (item.txt)");
        }

    }

    public void processCommands(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                String command = parts[0];

                // Route to appropriate handler
                switch (command) {
                    // Customer commands
                    case "CHPASS":
                        handleChangePassword(parts[1], parts[2], parts[3]);
                        break;

                    case "DEPOSITMONEY":
                        handleDepositMoney(parts[1], parts[2]);
                        break;

                    case "SHOWCAMPAIGNS":
                        handleShowCampaigns(parts[1]);
                        break;

                    case "ADDTOCART":
                        handleAddToCart(parts[1], parts[2]);
                        break;

                    case "EMPTYCART":
                        handleEmptyCart(parts[1]);
                        break;

                    case "ORDER":
                        handleOrder(parts[1], parts[2]);
                        break;


                    // Admin commands
                    case "ADDCUSTOMER":
                        handleAddCustomer(parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
                        break;

                    case "SHOWCUSTOMER":
                        handleShowCustomer(parts[1], parts[2]);
                        break;

                    case "SHOWCUSTOMERS":
                        handleShowCustomers(parts[1]);
                        break;

                    case "SHOWADMININFO":
                        handleShowAdminInfo(parts[1]);
                        break;

                    case "CREATECAMPAIGN":
                        handleCreateCampaign(parts[1], parts[2], parts[3], parts[4], parts[5]);
                        break;

                    case "ADDADMIN":
                        handleAddAdmin(parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
                        break;

                    case "ADDTECH":
                        handleAddTech(parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
                        break;


                    // Employee (Admin/Technician) commands
                    case "LISTITEM":
                        handleListItem(parts[1]);
                        break;

                    case "SHOWITEMSLOWONSTOCK":
                        if (parts.length == 3) {
                            handleShowItemsLowOnStock(parts[1], parts[2]);
                        } else {
                            handleShowItemsLowOnStock(parts[1], null);
                        }
                        break;

                    case "SHOWVIP":
                        handleShowVIP(parts[1]);
                        break;


                    // Technician commands
                    case "DISPITEMSOF":
                        handleDisplayItemsOf(parts[1], parts[2]);
                        break;

                    case "ADDITEM":
                        handleAddItem(parts[1], parts[2]);
                        break;

                    case "SHOWORDERS":
                        handleShowOrders(parts[1]);
                        break;

                    default:
                        System.out.println("Unknown command: " + command);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading commands file: ");
        }
    }

    // Helper method stubs

    // Customer
    private void handleChangePassword(String customerID, String oldPassword, String newPassword) {

        int ID = Integer.parseInt(customerID);

        for (Person p : allUsers) {
            if (p instanceof Customer) {
                Customer customer = (Customer) p;

                if (customer.getCustomerID() == ID) {
                    customer.changePassword(oldPassword, newPassword);
                    return;
                }
            }
        }
        System.out.println("No customer with ID number " + ID + " exists!");

    }

    public void handleDepositMoney(String customerID, String amountInStr) {

        int ID = Integer.parseInt(customerID);
        double amount = Double.parseDouble(amountInStr);

        // Find customer
        for (Person p : allUsers) {
            if (p instanceof Customer) {
                Customer customer = (Customer) p;
                if (customer.getCustomerID() == ID) {
                    customer.updateBalance(amount);
                    return;
                }
            }
        }

        System.out.println("No customer with ID number " + ID + " exists!");
    }

    private void handleShowCampaigns(String customerID) {}

    private void handleAddToCart(String customerID_str, String itemID_str) {

        int customerID = Integer.parseInt(customerID_str);
        int itemID = Integer.parseInt(itemID_str);

        // Find customer
        Customer targetCustomer = null;
        for (Person p : allUsers) {
            if (p instanceof Customer) {
                Customer customer = (Customer) p;
                if (customer.getCustomerID() == customerID) {
                    targetCustomer = customer;
                    break;
                }
            }
        }

        if (targetCustomer == null) {
            System.out.println("No customer with ID number " + customerID + " exists!");
            return;
        }


        // Find item
        Item targetItem = null;
        for (Item t : allItems) {
            if (t instanceof Item) {
                Item item = (Item) t;
                if (item.getItemID() == itemID) {
                    targetItem = item;
                    break;
                }
            }
        }

        if (targetItem == null) {
            System.out.println("Invalid item ID");
            return;
        }

        targetCustomer.addToCart(targetItem);
    }

    private void handleEmptyCart(String customerID) {}

    private void handleOrder(String customerID, String password) {}


    // Admin
    private void handleAddCustomer(String adminName, String customerName, String email,

                                   String dateOfBirth, String initialBalance, String password) {}

    private void handleShowCustomer(String adminName, String customerID) {

        int ID = Integer.parseInt(customerID);

        // Find admin
        boolean adminExists = false;
        for (Person p : allUsers) {
            if (p instanceof Admin && p.getName().equals(adminName)) {
                adminExists = true;
                break;
            }
        }

        if (!adminExists) {
            System.out.println("No admin person named " + adminName + " exists!");
            return;
        }

        // Find customer
        for (Person p : allUsers) {
            if (p instanceof Customer) {
                Customer customer = (Customer) p;
                if (customer.getCustomerID() == ID) {
                    System.out.println(p.toString());
                    return;
                }
            }
        }

        System.out.println("Customer not found!");
    }

    private void handleShowCustomers(String adminName) {

        boolean adminExists = false;

        // Find admin
        for (Person p : allUsers) {
            if (p instanceof Admin && p.getName().equals(adminName)) {
                adminExists = true;
                break;
            }
        }

        if (!adminExists) {
            System.out.println("No admin person named " + adminName + " exists!");
            return;
        }

        // List all customers
        for (Person p : allUsers) {
            if (p instanceof Customer) {
                Customer customer = (Customer) p;
                System.out.println(customer);
            }
        }
    }

    private void handleShowAdminInfo(String adminName) {

        for (Person p : allUsers) {
            if (p instanceof Admin && p.getName().equals(adminName)) {
                Admin admin = (Admin) p;
                admin.displayPersonalData();
                return;
            }
        }
        System.out.println("No admin person named " + adminName + " exists!");;

    }

    private void handleCreateCampaign(String adminName, String startDate, String endDate,
                                      String itemType, String rate) {}

    private void handleAddAdmin(String adminName, String newAdminName, String newAdminEmail,
                                String newAdminDateOfBirth, String newAdminSalary, String newAdminPassword) {}

    private void handleAddTech(String adminName, String newTechName, String newTechEmail,
                               String newTechDateOfBirth, String newTechSalary, String isSenior) {}


    // Employee (Admin & Tech)
    public void handleListItem(String employeeName) {

        boolean employeeExists = false;

        // Find employee (Admin or Tech)
        for (Person p : allUsers) {
            if ((p instanceof Admin || p instanceof Technician) && p.getName().equals(employeeName)) {
                employeeExists = true;
                break;
            }
        }

        if (!employeeExists) {
            System.out.println("No admin or technician person named " + employeeName + " exists!");
            return;
        }

        for (Item item : allItems) {
            item.displayItemInfo();
            System.out.println("-----------------------");
        }
    }

    private void handleShowItemsLowOnStock(String employeeName, String maxStock) {}

    private void handleShowVIP(String employeeName) {}


    // Tech
    private void handleDisplayItemsOf(String technicianName, String types) {}

    private void handleAddItem(String technicianName, String itemData) {}

    private void handleShowOrders(String technicianName) {}
}
