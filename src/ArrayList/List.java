package ArrayList;

import java.util.*;

public class List {
    private String name;

    public List(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<List> getList() {
        ArrayList<List> aList = new ArrayList<List>();

        aList.add(new List("Frederik"));

        return aList;
    }

    public boolean doesArraylistContainString(ArrayList<String> aList, String name) {

        for (String i : aList) {
            if (name.equals(i)) {
                System.out.println("Name is on the list");
                return true;
            }
            else {
                aList.add(name);
                System.out.println("Name added to list");
                return false;
            }
        }
        return true;
    }
}
