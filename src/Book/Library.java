package Book;

import java.util.*;

public class Library {

    ArrayList<Book> library = new ArrayList<Book>();

    {
        library.add(new Book("Zoro", 85858585, 1995));
        library.add(new Book("Alfons Aaberg", 65656565, 1982));
        library.add(new Book("Urok", 35353535, 1964));
    }

    public boolean checkBook(Book book) {

        for (Book b : library) {
            if (book.getISBN() == b.getISBN()) {
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;
    }
}
