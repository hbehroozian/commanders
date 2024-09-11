package basics;

public class EnhancedForExample {
    public static void main(String[] args) {

        int [] nums = {12,12,4,23,23,1,21,42,1,23,1,124,1,1};

//        for (int i = 0; i< nums.length; i++){
//            System.out.println(nums[i]);
//        }

        // for( data-type-in-the-array   pointer-name : collection-name )
        // for (declare a variable : name-of-collection)

        for(int n: nums){
            System.out.println(n);
        }

        double [][] numbersArray = {
                {12.5, 54.2, 12.3, 12, 45, 23.45, 12.99},
                {14.9, 14.4, 11.4, 89.9},
                {11.99, 19.99, 12.8},
                {55.99, 87.99}
        };

        double sum = 0;
        int count = 0;

        for(double[] row: numbersArray){
            for(double col: row){
                sum += col;
                System.out.print(col + " ");
            }
            count += row.length;
            System.out.println();
        }

        System.out.println("sum: " + sum);
        System.out.println("count: " + count);
        System.out.println("average: " + (sum/count));

    }
}
