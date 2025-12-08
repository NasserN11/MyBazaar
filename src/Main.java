public class Main {
    public static void main(String[] args) {

        MyBazaar system = new MyBazaar();

        // Load files
        system.loadUsers("users.txt");
        system.loadItems("item.txt");
        system.processCommands("commands.txt");


    }
}