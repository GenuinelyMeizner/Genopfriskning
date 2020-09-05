package Sort;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Sorting sorting = new Sorting();

        Scanner scan = new Scanner(System.in);
        System.out.print("Insert input1: ");
        String input1 = scan.nextLine();
        System.out.print("Insert input2: ");
        String input2 = scan.nextLine();
        System.out.print("Insert input3: ");
        String input3 = scan.nextLine();
        System.out.print("Insert input4: ");
        String input4 = scan.nextLine();
        System.out.print("Insert input5: ");
        String input5 = scan.nextLine();


        sorting.reverseSort(input1, input2, input3, input4, input5);
    }

}
