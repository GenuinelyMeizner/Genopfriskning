package Square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Square square = new Square();

        Scanner scan = new Scanner(System.in);
        System.out.print("How large? ");
        int iterations = scan.nextInt();

        square.createSquare(iterations);
    }
}
