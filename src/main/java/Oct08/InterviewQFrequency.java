package Oct08;

import java.util.ArrayList;
import java.util.HashMap;

public class InterviewQFrequency {
    public static void main(String[] args) {
        //Count Frequency of Each Character in a String:
        // Write a program to count the frequency of each character in a string.
        //Example Input: "character"
        //Example Output: c: 2, h: 1, a: 2, r: 2, t: 1, e: 1
        String sample = "character";
        System.out.println(findFrequency(sample));
        findFrequencyWithList(sample);
    }

    public static void findFrequencyWithList(String str) {
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (chars.contains(c)) {
                int index = chars.indexOf(c);
                int currentCount = counts.get(index);
                counts.remove(index);
                counts.add(index, currentCount + 1);
            } else {
                chars.add(c);
                counts.add(1);
            }
        }
        for (int i = 0; i < chars.size(); i++) {
            System.out.println(chars.get(i) + " " + counts.get(i));
        }
    }

    public static HashMap<Character, Integer> findFrequency(String str) {
        HashMap<Character, Integer> res = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (res.containsKey(c)) {
                res.put(c, res.get(c) + 1);
            } else {
                res.put(c, 1);
            }
        }
        return res;
    }


}
