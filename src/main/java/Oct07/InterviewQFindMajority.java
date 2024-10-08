package Oct07;

import java.util.HashMap;

public class InterviewQFindMajority {
    public static void main(String[] args) {
//        Find Majority Element: Write a function to find the
//        majority element in an array (element appearing more than n/2 times).
//                Example Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
//        Example Output: 4

        int[] input = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        System.out.println(findMajorityNum(input));
        System.out.println(findMajorityNumWithMap(input));
    }

    public static int findMajorityNum(int[] input) {
        int count = 0;
        for(int i: input){
            for (int j: input){
              if(i == j){
                  count++;
              }
            }
            if(count > input.length/2){
                return i;
            }
            count = 0;
        }
        return -1;
    }

    public static int findMajorityNumWithMap(int [] nums){
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i : nums){
            if(temp.containsKey(i)){
                // we already have the number as a key
                // increase the current count
                temp.put(i, temp.get(i) + 1);
            } else {
                // this is the first time we see the number
                // add it as a key and count of 1
                temp.put(i, 1);
            }
        }
        for (int key: temp.keySet()){
            System.out.println("key " + key + ", value " + temp.get(key));
            if(temp.get(key) > nums.length/2){
                return key;
            }
        }
        return -1;
    }

}
