package interviewprograms;

import java.util.Arrays;

/*
    Two strings are anagram if they contain same character but in different order.
    Ex: Ajmal mjalA

    Steps:
    1. Take two strings as input value.
    2. Convert two string to character array
    3. Sort them using arrays.sort() method.
    4. Compare two stringif they are equal/not
 */
public class AnagramCheckUsingArrayCompare {
    public static void main(String[] args) {
        String str1= "Ajmal";
        String str2= "mjalA";
        
        System.out.println("Both strings are anagram->  "+ checkAnagram(str1, str2));
        
    }
    
    public static boolean checkAnagram(String str1, String str2){
        
        char c1[]= str1.toCharArray();  // string broken to arrays of character
        char c2[]= str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
    
}
/*
        run:
    Both strings are anagram->  true
 */