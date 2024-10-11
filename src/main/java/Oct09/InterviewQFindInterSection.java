package Oct09;

import java.util.HashSet;

public class InterviewQFindInterSection {
    public static void main(String[] args) {
//        Find Intersection of Two Arrays: Write a program to find
//        the intersection of two given arrays.
//        Example Input: [1, 2, 3, 4, 5], [4, 5, 6, 7]
//        Example Output: [4, 5]
        int[] sample1 = {1, 2, 3, 4, 5};
        int[] sample2 = {4, 5, 6, 7};
        System.out.println(findIntersection(sample1, sample2));
    }

    public static HashSet<Integer> findIntersection(int[] a, int[] b) {
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> s = new HashSet<>();
        for (int i : a) {
            s.add(i);
        }
        for (int i : b) {
            if(s.contains(i)){
               res.add(i);
            }
        }
        return res;
    }
}
