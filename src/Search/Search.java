package Search;

public class Search {

    public boolean search(String[] dudes, String i) {
        int index = -1;

        for (int j = 0; j < dudes.length; j++) {
            if (dudes[j].equals(i)) {
                index = j;
                System.out.println(index);
                return true;
            }
        }
        System.out.println(index);
        return false;
    }

    public boolean searchAlternative(String[] dudes, String i) {
        int index = -1;

        for (int j = 0; j < dudes.length; j++) {
            if (dudes[j].equals(i)) {
                index = j;
                System.out.println(index);
                return true;
            }
        }
        try {
            throw new Exception("Wrong dude");
        }
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
