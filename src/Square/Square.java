package Square;

import java.util.*;

public class Square {
    public int iterations;

    public void createSquare(int iterations) {

        for (int i = 1; i <= iterations; i++) {
            for (int j = 1; j <= iterations; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
