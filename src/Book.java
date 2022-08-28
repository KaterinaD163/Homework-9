public class Book {
    private String title;
    private String authorName;
    private int yearOfPublication;

    public Book(String title, String authorName, int yearOfPublication) {
        this.title = title;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}

