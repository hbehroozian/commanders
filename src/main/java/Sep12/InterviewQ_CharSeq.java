package Sep12;

import java.util.HashMap;

public class InterviewQ_CharSeq {

    public static void main(String[] args) {

        // count the number of occurrences of each character in the given String

        String phrase = "this is 123a s2345ample @#$@%^!@String aeysaASOIthat you have^%@#&*^(&@^#5267^&@$^ to count the chars for";

        // code here

        System.out.println(getCountChars(phrase));
        System.out.println(getCountChars_NoSpace(phrase));
    }

    public static HashMap<Character, Integer> getCountChars(String str) {
        // create a map of char to keep track of the character and
        // integer to keep track of the count of the char
        HashMap<Character, Integer> res = new HashMap<>();

        // go through the string char by char
        for (char c : str.toCharArray()) {
            // for every char, see if its already in the map
            if (res.containsKey(c)) {
                // if yes - increase the current count in the map
                res.put(c, res.get(c) + 1);
            } else {
                // if no - add it to the map and give it the count of 1
                res.put(c, 1);
            }
        }
        // return the map
        return res;
    }
    public static HashMap<Character, Integer> getCountChars_NoSpace(String str) {
        // create a map of char to keep track of the character and
        // integer to keep track of the count of the char
        HashMap<Character, Integer> res = new HashMap<>();

        str = str.replaceAll("[0-9 a-z A-Z]", "");


        // go through the string char by char
        for (char c : str.toCharArray()) {
            System.out.println(c);
//            if(c == ' '){
//                continue;
//            }
            // for every char, see if its already in the map
            if (res.containsKey(c)) {
                // if yes - increase the current count in the map
                res.put(c, res.get(c) + 1);
            } else {
                // if no - add it to the map and give it the count of 1
                res.put(c, 1);
            }
        }
        // return the map
        return res;
    }


}
