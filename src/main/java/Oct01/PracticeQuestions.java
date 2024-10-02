package Oct01;

public class PracticeQuestions {

    public static void main(String[] args) {

//        Remove Duplicates from a String: Write a function to remove all
//        duplicate characters from a given string.
//        Example Input: "programming"
//        Example Output: "progamin"

        System.out.println(findDuplicate("programming"));

    }

    public static String findDuplicate(String str) {
        // create String res
        String res = "";
        // go through the string given, one char at a time
        for (int i = 0; i < str.length(); i++) {
            if (!res.contains(str.charAt(i) + "")) {
                // if the char is not in res, then add it to res
                res = res + str.charAt(i);
            }
            // if the char is in res, then dont add it
        }
        // return res
        return res;
    }


}
