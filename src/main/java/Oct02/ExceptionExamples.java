package Oct02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExamples {

    public static void main(String[] args) {

        int[] nums = {12, 4, 5, 0, 6, 1, 3, 1, 2, 0};

        System.out.println(divideNumbers(nums, 2, 4));

        readFile("path");
    }

    public static int divideNumbers(int[] numbers, int i1, int i2) throws ArithmeticException{
        try {
            return numbers[i1] / numbers[i2];
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The targeted index does not exist!");
        } catch (Exception e) {
            System.out.println("something went wrong!");
        }
        return -1;
    }

    public static void readFile(String path)  {
        try {
            FileInputStream fs = new FileInputStream(new File(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }



}
