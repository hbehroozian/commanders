package Oct08;

public class InterviewQFactorial {

    public static void main(String[] args) {
        //Factorial Calculation:** Write a program to calculate the factorial
        // of a given number using recursion. **Example Input:** `5` **Example Output:** `120`
        // 5 = 1x2x3x4x5

        int num = 5;
        System.out.println(findFactorial(num));
    }

    public static int findFactorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }


}
