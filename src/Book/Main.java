package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("ISBN: ");
        int ISBN = scan.nextInt();

        Book book = new Book(ISBN);

        Library l = new Library();

        l.checkBook(book);

    }
}
