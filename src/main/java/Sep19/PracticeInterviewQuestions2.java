package Sep19;

import java.util.*;

public class PracticeInterviewQuestions2 {
    public static void main(String[] args) {
        int[] temp = {1, 14, 1, 694, 52, 14, 66, 654, 4};

        System.out.println(getSecondLargestNum(temp));

        System.out.println(getNumberInPosition(temp, 3));
    }

    public static int getSecondLargestNum(int[] numbers) {
        int secondLargest = numbers[0];
        int largest = numbers[0];
        for (int numOfThisIteration : numbers) {
            if (numOfThisIteration > largest) {
                largest = numOfThisIteration;
            } else if (numOfThisIteration > secondLargest) {
                secondLargest = numOfThisIteration;
            }
        }
        return secondLargest;
    }

    public static int getNumberInPosition(int[] numbers, int position) {
        HashSet<Integer> temp = new HashSet<>();
        for (int i : numbers) {
            temp.add(i);
        }
        ArrayList<Integer> nums = new ArrayList<>(temp);
        Collections.sort(nums);
        System.out.println(nums);
        if (position > nums.size()) {
            System.out.println("Invalid Position Requested!");
            return -1;
        }
        return nums.get(nums.size() - position);
    }


}
