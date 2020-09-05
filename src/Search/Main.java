package Search;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Search search = new Search();

        Scanner scan = new Scanner(System.in);
        System.out.print("Insert search: ");
        String i = scan.nextLine();

        String[] dudes = {"Frederik", "Christoffer", "Magnus", "Mads"};

        search.searchAlternative(dudes, i);
    }
}
