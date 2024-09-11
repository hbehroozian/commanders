package basics;

public class BasicArithmetic {
    public static void main(String[] args) {

        // promotion
        // is the idea that when two data type in an operation are different but operation can take place,
        // java will convert one to the higher precision data type
        float f = 10.10F;
        double x = 10.0/3.6;
        System.out.println(x);

        // casting
        // you can convert any datatype to one another
        // if you are casting a number, we will always round down
        float y = (float) (10.0/ 3.6);
        System.out.println(y);

        String str = "str " + 123;
        System.out.println(str);

        // operators
        // + - / * %


        double w = 10.0/3.0;
        System.out.println(w);


        System.out.println("5/2 = " + 5/2);
        System.out.println("5%2 = " + 5%2);

//        System.out.println(12 + "t" / 2 + 5);
        System.out.println(12 + 5 * 2 / 'a');

        // += *= /= -= %=
        // shortcut operators

        int a = 10;

        a = 5;

        System.out.println(a = a + 10);

        System.out.println("what is the value of a? " + a);

        sum(10, 5);
        System.out.println();




    }

    public static void sum( int a, int b){
        System.out.println(a + b);
//        return a + b;



    }
}
