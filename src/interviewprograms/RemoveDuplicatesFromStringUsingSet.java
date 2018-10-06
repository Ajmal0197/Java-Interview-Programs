/*
1. Create a string from which duplicates has to be removed.
2. Write method removeDuplicates, which accepts String and returns String.
3. In this removeDuplicates() method create a HashSet.
    The important points about Java HashSet class are:
    HashSet stores the elements by using a mechanism called hashing.
    HashSet contains unique elements only

4. Loop through each character in the string.
5. Take each character from array and check in hashset if it is not present add to hashset and StringBuffer.
    Java StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.

6. After iterating each character in string return object from this method.
        Ex. java -> jav
 */
package interviewprograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromStringUsingSet {
    public static void main(String[] args) {
        String str="INTERVIEWPROGRAMS";
        System.out.println("Original String:    "+ str);
        System.out.println("\nString after duplicate removed:     "+ removeDuplicates(str));
        
    }

    private static String removeDuplicates(String str) {
        Set<Character> hs= new HashSet<>();
        StringBuffer sf= new StringBuffer();
        
        for(int i=0; i<str.length();i++){
            Character ch=str.charAt(i); //str.charAt(0)-> s
            if(!hs.contains(ch)){       //If 's' not present in hashset
                hs.add(ch);             //Add s to set
                sf.append(ch);          // s
            }
        }
        return sf.toString();
    }
}

/*
        run:
        Original String:    INTERVIEWPROGRAMS

        String after duplicate removed:     INTERVWPOGAMS
 */