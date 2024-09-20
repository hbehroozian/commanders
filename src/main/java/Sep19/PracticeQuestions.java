package Sep19;

public class PracticeQuestions {

    public static void main(String[] args) {

        String text = "this is a sample text";

        System.out.println(getConstantCharCount(text));
        System.out.println(getConstantCharCount2(text));

        System.out.println("--------------------------------");
        String text2 = "abc91xya2oiw305";
        System.out.println(getMax(text2));
        System.out.println(getMin(text2));


    }

    // you are given a string, return the count of consonants chars aeiou
    public static int getConstantCharCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!"aeiou".contains(str.toLowerCase().charAt(i) + "")) {
                count++;
            }
        }
        return count;
    }

    public static int getConstantCharCount2(String str) {
        return str.toLowerCase().replaceAll("[aeiou]", "").length();
    }


    // find the min and max number from a given string, String str = "abc91xya2oiw305"; ?
    public static int getMax(String str) {
        // create an int max to keep track of the max
        int largest = 0;
        // split based on everything that is not 0-9 to nothing
        // it should give us an array {,,,91,,,2,,,305}
        // go through the array and convert the values that have length of more than 0 to int
        // compare the int to see if it's bigger than the max
        for (String s : str.split("[^0-9]")) {
            if (s.length() > 0) {
                int num = Integer.valueOf(s);
                // if yes = max = new value
                // if no go to next
                largest = num > largest ? num : largest;
            }
        }
        // return max
        return largest;
    }

    // find the min and max number from a given string, String str = "abc9xya2oiw3"; ?
    public static int getMin(String str) {
        int smallest = Integer.MAX_VALUE;
        for (String s : str.split("[^0-9]")) {
            if (s.length() > 0) {
                int num = Integer.valueOf(s);
                smallest = num < smallest ? num : smallest;
            }
        }
        return smallest;
    }

}
