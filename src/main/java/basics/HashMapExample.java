package basics;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {


        HashMap<String, String> employees = new HashMap<String, String>();

        // to add data pair, use the method put
        employees.put("Admin","Mahdi");
        employees.put("Instructor", "Sakhi");
        employees.put("Admin","Mike");

        // to get the data, use the key
        System.out.println(employees.get("Admin"));

        // to check to see if a key exists in the map, use containsKey
        System.out.println(employees.containsKey("HR"));

        // to get all of the keys, use the method keyset
        System.out.println(employees.keySet());

        // to get all of the entries/ values, use the method values
        System.out.println(employees.values());

        System.out.println(employees);


        // how to iterate through the map
        for(String key: employees.keySet()){
            System.out.println(key + " -> " + employees.get(key));
        }
    }
}
