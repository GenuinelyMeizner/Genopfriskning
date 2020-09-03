package ProperCase;

public class Sorting {

    public void sortPhrase(String phrase) {

        if (!phrase.equals(phrase.toLowerCase())) {

            System.out.println(phrase);
        }

        if (phrase.length() > 3) {
            String output = phrase.substring(0, 1).toUpperCase() + phrase.substring(1);
            System.out.println(output);
        }

        if (phrase.length() <= 3) {
            String output2 = phrase.toLowerCase();
            System.out.println(output2);
        }
    }
}
