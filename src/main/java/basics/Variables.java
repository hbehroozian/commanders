package basics;

// import statement will be on the top of the class after the package


public class Variables {
    /**
     * java docs - documentation
     * this class is all the in-class practices for
     * comments and data types for variables
     */
    public static void main(String[] args) {

        // TODO understand the types of comments we have
        // write something - single line comment
        // the shortcut for commenting : ctrl + / (select the lines and press ctrl + / to comment or uncomment)

        /*
         multi
         line
         comment
        */

        // TODO: I have add a method and make this reusable
        // FIXME: there is a problem in the return of this method


        // auto complete ctrl + space
        System.out.println();


        // TODO - study data types in java
        // we have 2 data types in java
        // 1 - primitive (we have 8 of them)
        // 2 - reference (instances of classes - infinite)

        // members of a class
        // 1 - variables
        // 2 - methods


        // The 8 primitives
        // 1. whole number / complete numbers
        // byte
        byte b = 10;
        System.out.println("byte range is (" + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE + ")");
        // short
        short s = 15;
        System.out.println("short range is (" + Short.MIN_VALUE + " - " + Short.MAX_VALUE + ")");
        // int
        int i = 25;
        System.out.println("int range is (" + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + ")");
        // long
        long l = 1245;
        System.out.println("long range is (" + Long.MIN_VALUE + " - " + Long.MAX_VALUE + ")");

        // 2. fractional numbers / numbers with decimal points
        // float
        float f = 12.12F;
        System.out.println("float range is (" + Float.MIN_VALUE + " - " + Float.MAX_VALUE + ")");
        // double
        double d = 45.12;
        System.out.println("double range is (" + Double.MIN_VALUE + " - " + Double.MAX_VALUE + ")");

        // char
        char c = 'a';
        System.out.println((int)c);

        // boolean
        boolean bol = true;


    }


//    Java docs is going to be the description you want to add to your methods
//    this is going to be carried with the method
//    /**
//     * @param a: is going to be the first integer
//     * @param b: is the second integer
//     * @return - this method will return the sum/addition of the parameter a and b
//     */
//    public static int sum(int a, int b){
//        return a +b;
//    }

}
