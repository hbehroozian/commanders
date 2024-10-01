package Sep30;

import static Sep30.Book.getPublisher;
import static java.lang.Math.*;

public class Runenr {



    public static void main(String[] args) {


        // final means that you can not change the value
        // final variable = once you assign a value, you can not change the value
        // final method = you can not override the method
        // final class = you can not inherit from the class



        Book obj1 = new Book("a", 10.99);
        Book obj2 = new Book("b", 12.99);
        Book obj3 = new Book("c", 13.99);
        Book obj4 = new Book("d", 14.99);

        System.out.println(getPublisher());

        int a = 10, b = 15;

        System.out.println(max(a,b));


        SampleDriver temp = SampleDriver.getInstance();


    }
}
