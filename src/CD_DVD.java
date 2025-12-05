public class CD_DVD extends OfficeSupplies {

    // CD_DVD attributes
    private String composer;
    private String songs;


    // Constructor
    public CD_DVD(int itemID, double price, int stock,
                  String releaseDate, String coverTitle,
                  String composer, String songs) {

        super(itemID, price, stock, "CD_DVD", releaseDate, coverTitle);

        this.composer = composer;
        this.songs = songs;
    }


    // Getters
    public String getComposer() { return composer;}

    public String getSong() { return songs; }


    // Methods
    public String toString() {
        return "Composer: " + composer + " Songs: " + songs;
    }
}
