package Grass;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Grass grass = new Grass();

        Scanner garden1 = new Scanner(System.in);
        System.out.print("How long is your grass? ");
        double growth = garden1.nextDouble();

        Scanner garden = new Scanner(System.in);
        System.out.print("When should your grass be cut? ");
        double cut = garden.nextDouble();

        System.out.println(grass.startCut(cut, growth));
    }
}