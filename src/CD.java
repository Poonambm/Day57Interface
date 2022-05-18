public class CD implements Packable {

    private String artist;

    private String name;

    private int pubYear;

    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }

    private double weight;

    public double weight() {

        return this.weight;

    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + this.pubYear + ")";
    }

}