import java.util.*;

public class Main {

    //Kan du se det her?

    public static void main(String[] args){

        List l = new List("name");

        ArrayList<String> aList = new ArrayList<String>();

        aList.add("Frederik");

        Scanner scan = new Scanner(System.in);
        System.out.print("Insert name: ");
        String name = scan.nextLine();

        l.doesArraylistContainString(aList, name);

    }
}
