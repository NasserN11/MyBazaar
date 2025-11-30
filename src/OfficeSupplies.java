public class OfficeSupplies extends Item {

    // OfficeSupplies attributes
    private String releaseDate;
    private String coverTitle;


    // Constructor
    public OfficeSupplies(int itemID, double price, int stock, String releaseDate, String coverTitle) {

        super(itemID, price, stock);

        this.releaseDate = releaseDate;
        this.coverTitle = coverTitle;
    }


    // Getters
    public String getReleaseDate() { return releaseDate; }

    public String getCoverTitle() { return coverTitle; }
}