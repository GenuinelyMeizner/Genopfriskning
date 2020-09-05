package ProperCase;

public class Sorting {

    public void sortPhrase(String phrase) {

        String[] parts = phrase.split(" ");

        for(String string : parts) {

            if (string.equals(string.toUpperCase())) {

                System.out.println(string);
            }

            else if (string.length() > 3) {
                String output = string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
                System.out.println(output);
            }

            else if (string.length() <= 3) {
                String output2 = string.toLowerCase();
                System.out.println(output2);
            }
        }
    }
}
