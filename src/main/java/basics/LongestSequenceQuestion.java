package basics;

public class LongestSequenceQuestion {

    public static void main(String[] args) {
        String sequence = "01010100111110011101001";

        System.out.println(getLongestSeqLength(sequence, "1"));


        System.out.println("-----------------------");

        System.out.println(getLongestSeqLength2(sequence, '0'));
    }
    // loop through it and keep count

    public static int getLongestSeqLength(String sequence, String num) {
        // split with zero and find the longest string
        String[] temp = sequence.split(num);
        int longest = 0;
        for (String n : temp) {
            System.out.println(n + " --> " + n.length());
            longest = Math.max(longest, n.length());
        }
        return longest;
    }

    public static int getLongestSeqLength2(String sequence, char n) {
        int longest = 0;
        int count = 0;
        for (char c : sequence.toCharArray()) {
            if(c == n){
                count++;
                longest = Math.max(longest, count);
            } else {
                count = 0;
            }
        }
        return longest;
    }


}
