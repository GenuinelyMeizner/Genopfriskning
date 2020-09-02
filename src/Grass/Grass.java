package Grass;

import java.util.*;

public class Grass {

    public double startCut(double cut) {

        int count = 0;

        for (double growth = 0; cut >= growth; growth = growth + 0.8) {
            count++;
        }

        return count;
    }
}

