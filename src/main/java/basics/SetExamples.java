package basics;

import java.util.HashSet;

public class SetExamples {
    public static void main(String[] args) {


        HashSet<String> keys = new HashSet<String>();

        keys.add("a23423423Mon1231231");
        keys.add("bSat");

        System.out.println(keys.contains("bSat"));


        System.out.println(keys);

        // un-ordered
        // un-sorted
        // all of the sets will take unique values only
        // its not index based - so cant loop with index

        // how to process a set
        for (String i : keys) {
            System.out.println(i);
        }


    }

}
