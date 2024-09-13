package Sep12;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsExamples {


    public static void main(String[] args) {


        HashMap<Integer, String> temp = new HashMap<>();
        temp.put(1, "test");
        System.out.println(temp.get(1).substring(0, 3)); //what does this return?????


        HashMap<String, ArrayList<String>> deptartments = new HashMap<>();

        deptartments.put("HR", new ArrayList<>());
        deptartments.put("IT", new ArrayList<>());
        deptartments.put("SALES", new ArrayList<>());

        deptartments.get("IT").add("Jack");
        deptartments.get("IT").add("David");
        deptartments.get("IT").add("Anna");
        deptartments.get("IT").add("Ahmad");
        deptartments.get("HR").add("Dan");
        deptartments.get("HR").add("Roza");

        System.out.println(deptartments);


        ArrayList<HashMap<String, ArrayList<HashMap<Integer, String>>>> something = new ArrayList<>();
        something.add(new HashMap<>());
        something.get(0).put("key1", new ArrayList<>());
        something.get(0).get("key1").add(new HashMap<>());
        something.get(0).get("key1").get(0).put(1, "test");
        System.out.println(something);

    }


}
