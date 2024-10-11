package Oct09;

import java.util.Collection;
import java.util.HashMap;

public class InterviewQMakePalindrome {
    public static void main(String[] args) {


        String[] examples = {"abcb", "abcbc", "abab", "abcab", "abc", "apple"};

        for (String s : examples) {
            System.out.println(makePalindrome(s));
        }

    }


    public static int makePalindrome(String str) {
        HashMap<Character, Integer> chars = countChars(str);
        int countOfChars = chars.keySet().size();

        if(str.length() < 2){
           return 0;
        } else if (countOfChars == 2){
            return str.length();
        }
        return 0;
    }

    public static HashMap<Character, Integer> countChars(String str) {
        HashMap<Character, Integer> chars = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (chars.containsKey(c)) {
                chars.put(c, chars.get(c) + 1);
            } else {
                chars.put(c, 1);
            }
        }
        return chars;
    }

    public static int getSum(Collection<Integer> values){
        int res = 0;
        for (int i: values){
            res += i;
        }
        return res;
    }

}


