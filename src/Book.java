public class Book extends OfficeSupplies {

    // Book attributes
    private String publisher;
    private String author;
    private int numberOfPages;


    // Constructor
    public Book(int itemID, double price, int stock,
                String releaseDate, String coverTitle,
                String publisher, String author, int numberOfPages) {

        super(itemID, price, stock, "BOOK", releaseDate, coverTitle);

        this.publisher = publisher;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }


    // Getters
    public String getPublisher() { return publisher; }

    public String getAuthor() { return author; }

    public int getNumberOfPages() { return numberOfPages; }


    // Methods
    public String toString() {
        return "Publisher: " + publisher + " Author: " + author + " Pages: " + numberOfPages;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Type: Book");
        System.out.println("Item ID: " + getItemID());
        System.out.println("Price: " + getPrice() + " $");
        System.out.println("Release Date: " + getReleaseDate());
        System.out.println("Title: " + getCoverTitle());
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: " + author);
        System.out.println("Page: " + numberOfPages + " pages");
    }
}
