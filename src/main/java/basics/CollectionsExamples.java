package basics;

public class CollectionsExamples {
    public static void main(String[] args) {
        int [] numbers = {15,25,35};

        System.out.println("-----------------------------");

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        for(int i = 0; i < 3; i++){
            System.out.println("i " + i);
            System.out.println(numbers[i]);
        }

        System.out.println("-----------------------------");
        System.out.println(numbers.length);

        double [] nums = new double[5];
        System.out.println(nums[4]);

        int [][] temp =
                {
                        {10,15},// temp[0].length = 2
                        {20,25,23}, // temp[1].length = 3
                        {86,45,34,23,1} // temp[2].length = 5
                };

        System.out.println("************************");


        for (int i = 0; i< temp.length; i++){
            for(int j = 0; j< temp[i].length; j++){
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("************************");

        // [row][col]
        // [outer][inner]
        // {{10,20},{15,25},{30,40},{35,45},{50,60}}
        //    0        1       2       3       4
        // {0,0}
        // {0,0}
        // {0,0}
        // {0,0}
        // {0,0}

        // two dimension array is multiple of one dimension arrays
        // two dimension array of double
        // 12.5, 54.2, 12.3
        // 14.9, 14.4, 11.4
        // 11.99, 19.99, 12.8
        System.out.println("===============================");
        double [][] numbersArray = {
                {12.5, 54.2, 12.3, 12, 45, 23.45, 12.99},
                {14.9, 14.4, 11.4, 89.9},
                {11.99, 19.99, 12.8},
                {55.99, 87.99}
        };
        double sum = 0;
        int count = 0;
        // then create a nested for loop and print them
        for (int row= 0; row<numbersArray.length; row++){
            for (int col = 0; col< numbersArray[row].length; col++){
                sum += numbersArray[row][col];
                System.out.print(numbersArray[row][col] + ", ");
            }
            count += numbersArray[row].length;
            System.out.println();
        }

        // optional: sum all the numbers and print the sum
        System.out.println("Sum: " + sum);
        // optional: give me the average of all the numbers
        // sum / count
        System.out.println("Count: " + count);
        System.out.println("Average: " + (sum/count));
        System.out.println("===============================");



    }
}
