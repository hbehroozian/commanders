package Oct03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounting {

    /*
    Hello h=1 e=1 l=2 o=1

    For any given input count the characters
     */
    //Store the result of each character in a map and check each character against the map.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text without space");
        String text = scanner.next();

        Map<Character, Integer> characterMap = new HashMap<>();

        char[] characters = text.toCharArray();

        for (char character : characters) {
            Integer lookup = characterMap.get(character);
            if (lookup == null) { // Character is not exist in the map
                characterMap.put(character, 1);
            } else { // Character exist increment the count by 1
                characterMap.put(character, lookup + 1);
            }
        }
        System.out.println(characterMap);
    }

}
