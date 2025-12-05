import java.util.ArrayList;

public class MyBazaar {

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
    public void loadUsers(String fileName);

    public void loadItems(String fileName);

    public void processCommands(String fileName);
}
