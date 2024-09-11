package basics;

public class ForLoopExamples {


    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("----------------------");
        for(int i = 9; i >=0; i--){
            System.out.println(i);
        }


        System.out.println("----------------------");
        // Palindrome - reads teh same from both directions
        String word = "abcd";
        String rev = "";
        for(int i = 0; i < word.length(); i++){
            System.out.println(i + " = " + word.charAt(i));
        }

        System.out.println("----------------------");

        for(int i = word.length() - 1; i >= 0 ; i--){
            rev += word.charAt(i);
            System.out.println(i + " = " + word.charAt(i));
        }

        StringBuilder sb = new StringBuilder(word);
        System.out.println("this is with StringBuilder: " + sb.reverse());


        System.out.println(word);
        System.out.println(rev);
        if(word.equals(rev)){
            System.out.println("the word is palindrome!");
        } else {
            System.out.println("the word is not palindrome!");
        }

    }
}
