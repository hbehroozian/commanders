package Oct10;

import Sep18.A;

import java.util.*;

public class InterviewQSortWords {

    public static void main(String[] args) {
//        Sort Words by Their Length: Write a function to
//        sort words in a string by their length using a TreeMap.
//                Example Input: "the quick brown fox"
//        Example Output: ["the", "fox", "quick", "brown"]
        String sample = "the quick brown fox";
        System.out.println(sortWordsByLength(sample));
    }

    public static List<String> sortWordsByLength(String str){
        TreeMap<Integer, ArrayList<String>> temp = new TreeMap<>();

        for (String w: str.split(" ")){
            if(temp.containsKey(w.length())){
                // the list is already added
                temp.get(w.length()).add(w);
            } else {
                // this is the first time we are seeing this length
                temp.put(w.length(), new ArrayList<>());
                temp.get(w.length()).add(w);
            }
        }
        List<String> res = new ArrayList<>();
        for (int len: temp.keySet()){
            res.addAll(temp.get(len));
        }
        return res;
    }

}
