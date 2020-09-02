package Grass;

import java.util.*;

public class Grass {

    public double startCut(double cut, double growth) {

        int count = 0;

        for (growth = growth; cut >= growth; growth = growth + 0.8) {
            count++;
        }

        return count;
    }
}

