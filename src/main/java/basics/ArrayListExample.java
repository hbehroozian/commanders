package basics;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>();

        names2.add("David");
        names2.add("Ahmad");
        names2.add("Anna");
        names2.add("Joe");


        // to add a variable
        names.add("Jack");
        names.add("Mike");


        // get a variable
        System.out.println(names.get(0));

        // to get the size of the array
        System.out.println(names.size());

        // add a collection in an arraylist
        names.addAll(names2);

        // Collections classes have toString method implemented
        // toString method will give you a String representation of the object
        System.out.println(names);

        // to check to see if a value exists in a list
        System.out.println(names.contains("Anna"));

        //
        System.out.println(names.indexOf("asd"));

    }

}
