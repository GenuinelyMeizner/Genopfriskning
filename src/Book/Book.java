package Book;

public class Book {
    private String title;
    private int ISBN;
    private int year;

    public Book(String title, int ISBN, int year) {
        this.title = title;
        this.ISBN = ISBN;
        this.year = year;
    }

    public Book(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN() {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + "" + year + "" + ISBN;
    }
}
