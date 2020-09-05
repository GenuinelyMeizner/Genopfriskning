package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public String input1;
    public String input2;
    public String input3;
    public String input4;
    public String input5;

    public Sorting(String input1, String input2, String input3, String input4, String input5) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
        this.input5 = input5;
    }

    public Sorting() {

    }

    public void reverseSort(String input1, String input2, String input3, String input4, String input5) {
        List<String> list = Arrays.asList(input1, input2, input3, input4, input5);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}
