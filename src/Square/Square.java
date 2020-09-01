package Square;

import java.util.*;

public class Square {
    public int iterations;

    public String createSquare(int iterations) {

        Scanner scan = new Scanner(System.in);
        System.out.print("How large? ");
        iterations = scan.nextInt();

        for (int i = 0; i == iterations; i++) {
            System.out.print("*");
            for (i = 0; i == iterations; i++) {
                System.out.print("*");
            }
        }
        return "completed";
    }
}
