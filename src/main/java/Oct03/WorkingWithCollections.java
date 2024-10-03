package Oct03;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithCollections {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Tysons");
        cities.add("Fairfax");
        cities.add("Alexandria");
        cities.add("Arlington");
        cities.add("woodbridge");

        //Find the specific value in Collection
        // find index number of FairFax
        for(int i = 0; i < cities.size(); i ++ ) {
            if (cities.get(i).equals("Fairfax")){
                System.out.println("Index number " + i);
                break;
            }
        }

        //Find all cities that have more than 5 character length
        // collect them into another collection
        List<String> filtered = new ArrayList<>();
        for(String city : cities) {
            if (city.length() > 7)
                filtered.add(city);
        }
        System.out.println(filtered);

        //Remove all the Cities Start with Letter A
        List<String> toDelete = new ArrayList<>();
        for (String city : cities) {
            if (city.toLowerCase().startsWith("a")){
                toDelete.add(city);
            }
        }

        cities.removeAll(toDelete);
        System.out.println(cities);

    }
}
