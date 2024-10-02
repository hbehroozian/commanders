package Oct01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingExamples {

    public static void main(String[] args) {


        try {
            System.out.println(div(10, 0));
        } catch (ArithmeticException e) {
            throw e;
        }


        System.out.println("this is a test".indexOf("testing"));

        // try/catch

        // throws


        readFile("");

        try {
            readFile2("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


    public static int div(int a, int b) {
//        if(b == 0){
//            System.out.println("can not perform!");
//            return -1;
//        }
        return a / b;
    }


    public static String readFile(String path) {
        try {
            FileInputStream fl = new FileInputStream(new File(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "";
    }

    public static String readFile2(String path) throws FileNotFoundException {

        FileInputStream fl = new FileInputStream(new File(path));

        return "";
    }

}
