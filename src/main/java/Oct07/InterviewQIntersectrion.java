package Oct07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class InterviewQIntersectrion {
    public static void main(String[] args) {
//        Find Intersection of Two Arrays: Write a program to find the
//        intersection of two given arrays.
//        Example Input: [1, 2, 3, 4, 5], [4, 5, 6, 7]
//        Example Output: [4, 5]

        int[] nums1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] nums2 = {4, 5, 6, 7};

        System.out.println(findIntersection(nums1, nums2));
        System.out.println(findIntersectionWithSet(nums1, nums2));
    }

    public static ArrayList<Integer> findIntersectionWithSet(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();

        // create hashset and add first array
        HashSet<Integer> temp1 = new HashSet<>();
        for (int i : a) {
            temp1.add(i);
        }
        // create hashset and add second array
        HashSet<Integer> temp2 = new HashSet<>();
        for (int i : b) {
            temp2.add(i);
        }
        // go through the first sets
        for (int i : temp1) {
            if(temp2.contains(i)){
                res.add(i);
            }
        }
        // compare each value to the entire second array
        // if matched, then add to array list

        return res;
    }

    public static ArrayList<Integer> findIntersection(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();

        // go through the first array
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    res.add(i);
                }
            }
        }
        // compare each value to the entire second array
        // if matched, then add to array list

        return res;
    }

}
