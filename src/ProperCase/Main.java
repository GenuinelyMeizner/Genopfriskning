package ProperCase;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Sorting sorting = new Sorting();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter phrase: ");
        String phrase = scan.nextLine();

        sorting.sortPhrase(phrase);
    }
}
