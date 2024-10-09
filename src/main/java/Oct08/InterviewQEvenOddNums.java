package Oct08;

import Sep18.A;

import java.util.ArrayList;
import java.util.HashMap;

public class InterviewQEvenOddNums {
    public static void main(String[] args) {

        // find all of the even numbers in an array of numebrs
        // find odd numebrs
        // sum of even numbers
        // sum of odd numbers
        // find which sum is bigger

        int[] numbers = {1321,85,156,651,31,654,6,132,1654,65,121,65,631,1,65,165,4986,6,65,489,52};
        System.out.println(findNumbersWithReturn(numbers));
    }

    public static void findNumbers(int[] nums) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                // even
                evenNumbers.add(nums[i]);
                evenSum += nums[i];
            } else {
                // odd
                oddNumbers.add(nums[i]);
                oddSum += nums[i];
            }

        }
        System.out.println("Even Numbers: " + evenNumbers + " = " + evenSum);
        System.out.println("Odd Numbers: " + oddNumbers + " = " + oddSum);
        System.out.println(evenSum > oddSum ? ("Even: " + evenSum) : ("Odd: " + oddSum));
    }

    public static HashMap<String, Object> findNumbersWithReturn(int[] nums) {
        HashMap<String, Object> res = new HashMap<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                // even
                evenNumbers.add(nums[i]);
                evenSum += nums[i];
            } else {
                // odd
                oddNumbers.add(nums[i]);
                oddSum += nums[i];
            }

        }
        res.put("Even Numbers", evenNumbers);
        res.put("Odd Numbers", oddNumbers);
        res.put("Even Total", evenSum);
        res.put("Odd Total", oddSum);
        res.put("Even/Odd Comparison", (evenSum > oddSum ? ("Even: " + evenSum) : ("Odd: " + oddSum)));

        return res;
    }

}
