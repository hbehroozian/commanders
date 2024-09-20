package Sep19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ReviewSession {
    public static void main(String[] args) {
        ArrayList<String> tempList = new ArrayList<>();

        tempList.add("value 1");
        tempList.add("value 2");
        tempList.add("value 3");
        tempList.add("value 4");
        tempList.add("value 5");

        HashSet<Integer> tempSet = new HashSet<>();
        tempSet.add(10);
        tempSet.add(11);
        tempSet.add(12);
        tempSet.add(13);
        tempSet.add(14);


        printItems(tempList);
        printItems(tempSet);
    }


    public static void printItems(Collection i){
        for (Object o: i){
            System.out.println(o);
        }
    }


}
