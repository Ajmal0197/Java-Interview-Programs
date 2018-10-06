/*
1. Create a string from which duplicates has to be removed.
2. Write method displayDuplicates, which accepts String.
3. In this removeDuplicates() method create a HashMap with <Character, Integer>....{key, value}
    Lists represent a sequential ordering of elements. Maps are used to represent a collection of key / value pairs.

4. Convert String to character array.
5. Loop through each character in the array.
6. Take each character from array and check for key in hashmap if it is not present add to hashmap with character as key and 1 as value.
7. If it is present in hashmap add the key as character and increment the count.
8. Loop through each character in the map and print only those value with occurence greater than 1.
        Ex. java -> a:2
 */
package interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicateCharswithNoOfOccurUsingHashMap {
    public static void main(String[] args) {
        printDuplicateCharacters("Programming");
        printDuplicateCharacters("Java");
    }

    /*
     * Find all duplicate characters in a String and print each of them.
     */
    public static void printDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();

        // build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (!charMap.containsKey(ch)) { //if map dont contains the character
                charMap.put(ch, 1);         //put value of key as 1
            } else {
                charMap.put(ch, charMap.get(ch) + 1);   //if present keep incrementing the value
            }
        }

        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {     //if the valuepart of key(character) is >1 then it has duplicate
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

}

/*
        run:
        List of duplicate characters in String 'Programming' 
        r : 2 
        g : 2 
        m : 2 
        List of duplicate characters in String 'Java' 
        a : 2 
 */
