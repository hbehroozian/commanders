package Oct08;

import java.util.Stack;

public class InterviewQParanthesisBalance {
    public static void main(String[] args) {
//        Check for Balanced Parentheses:
//        Write a function to check if a given string has balanced parentheses.
//        Example Input: "(a+b) * (c+d)"
//        Example Output: true


        String sample = "(a+b) * (c+d)";
        System.out.println(isBalanced(sample));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> chars = new Stack<>();

        for (char c : str.toCharArray()) {
            // check to see if the char is (
            if (c == '(') {
                // put it in the stack
                chars.push(c);
            } else if (c == ')') {
                // we should make sure that the stack is not empty
                if (chars.isEmpty()) {
                    return false;
                }
                // we should pop from the stack
                chars.pop();
            }
        }
        // we should make sure that the stack is empty
        return chars.isEmpty();
    }
}
