package Sep18;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        B obj = new B();

        System.out.println(obj.strInB.length());

        obj.setNumberInA(15);

        A obj2 = new A();
        System.out.println("a " +obj2.getNumberInA());
        System.out.println("b " + obj.getNumberInA());


        List<String> testList = new Stack<>();

        testList.add("text 1");
        testList.add("text 2");
        testList.add("text 3");
        testList.add("text 4");


        ArrayList<Object> temp = new ArrayList<>();
        temp.add("test");
        temp.add(12);
        temp.add(12.23);
        temp.add('a');


    }





}
