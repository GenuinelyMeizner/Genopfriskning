package Grass;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Grass grass = new Grass();

        Scanner garden = new Scanner(System.in);
        System.out.print("When should you grass be cut? ");
        double cut = garden.nextDouble();

        System.out.println(grass.startCut(cut));
    }
}