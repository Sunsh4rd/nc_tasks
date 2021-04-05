package book;

public class Book {

    @SetName(name = "My book")
    private String name;
    @SetReleaseYear(year = 2002)
    private int releaseYear;
    @SetAuthor(name = "Some Author")
    private String author;

    public Book(String name, int releaseYear, String author) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
