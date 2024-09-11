package basics;

public class PalindromeExample {
    public static void main(String[] args) {

        // trying to solve palindrome with loop without reversing the word
        String word = "madam";
        boolean isPalindrome = true;
        for(int fwd = 0, bck = word.length()-1 ; fwd < bck ; fwd++, bck--){
            if(word.charAt(fwd) != word.charAt(bck)){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome? "Word is Palindrome!": "Word is NOT Palindrome!");

        System.out.println("this is using the method: " + isWordPalindrome(word));
    }

    public static boolean isWordPalindrome(String word){
        for(int fwd = 0, bck = word.length()-1 ; fwd < bck ; fwd++, bck--){
            if(word.charAt(fwd) != word.charAt(bck)){
                System.out.println("Method: Word is not palindrome!");
                return false;
            }
        }
        System.out.println("Method: Word is palindrome!");
        return true;
    }



}
