package Oct02;

public class JavaMemoryExamples {

    public static void main(String[] args) {

        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false


        String str= "test";
        System.out.println(str.toUpperCase());

        System.out.println(str);

        StringBuilder sb = new StringBuilder("test");
        sb.append("ing");

        System.out.println(sb);

        // mutation - we have mutable and immutable classes/ datatypes

        // mutable classes - if you change something in the object, the change
        // will take place in that same object in the memory

        // immutable - if you change something, a new object is going to get created


    }


}
