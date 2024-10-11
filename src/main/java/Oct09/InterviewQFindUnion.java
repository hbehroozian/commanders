package Oct09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterviewQFindUnion {

    public static void main(String[] args) {
//        Find Union of Two Arrays: Write a program to
//        find the union of two given arrays.
//
//        Example Input: [1, 2, 3], [2, 3, 4]
//        Example Output: [1, 2, 3, 4]
        int[] sample1 = {1, 2, 3};
        int[] sample2 = {2, 3, 4, 5, 6};

        System.out.println(findUnion(sample1, sample2));

    }

    public static Set<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> temp = new TreeSet<>();
        for (int i: a){
            temp.add(i);
        }
        for (int i : b) {
            temp.add(i);
        }
        return temp;
    }

}


