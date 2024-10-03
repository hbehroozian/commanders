package Oct02;

public class PracticeQuestion {

    public static void main(String[] args) {
//        Find All Pairs with a Given Sum: Write a program to find all pairs of
//        elements in an array that sum up to a given target value.
//        Example Input: [1, 2, 3, 4, 5, 6], Target = 7
//        Example Output: (1, 6), (2, 5), (3, 4)


//        Find the Missing Number: Write a program to find the missing
//        number in a sequence of integers from 1 to n.
//        Example Input: [1, 2, 4, 5, 6]
//        Example Output: 3

        int[] numbers = {4, 5, 6, 7, 8, 9};

        System.out.println(findMissing(numbers));
    }

    public static int findMissing(int[] numbers) {
        // start from the second index
        for (int i = 0; i < numbers.length; i++) {
            if(i+1 == numbers.length){
                break;
            }
            // create temp int that should be
            if (numbers[i] + 1 != numbers[i+1]) {
                System.out.println("Missing number found");
                return numbers[i] + 1;
            }
        }
        System.out.println("no missing number!");
        return -1;
    }

}
