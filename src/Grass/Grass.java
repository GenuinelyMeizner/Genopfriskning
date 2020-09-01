package Grass;

import java.util.*;

public class Grass {
    private double growth = 0.8;
    private double cut;

    public Grass(double growth, double cut) {
        this.growth = growth;
        this.cut = cut;
    }

    public double getGrowth() {
        return growth;
    }

    public double getCut() {
        return cut;
    }

    public void setCut() {
        this.cut = cut;
    }

    public double startCut(double growth, double cut) {

        int count = 0;

        for (growth = 0.8; cut >= growth; growth = growth + 0.8) {
            count++;
        }

        return count;
    }
}

