package interviewprograms;

import java.util.Arrays;
import java.util.Collections;
/*

 */
public class SortingStringArrayElements {
    public static void main(String[] args) {
        String []characters={"a","y", "q", "d", "g"};
        System.out.println(" Elements: ");
        for(String s: characters){
            System.out.print(s);
        }
        
        Arrays.sort(characters);
        System.out.println("\n Sorted in Ascending order Elements: "); //Descending order is printed
        for(String s: characters){
            System.out.print(s);
        }
        
        Arrays.sort(characters, Collections.reverseOrder());           //The reverseOrder() method is used to get a comparator that imposes the reverse of the natural ordering 
        System.out.println("\n Sorted in Descending order Elements: ");// on a collection of objects that implement the Comparable interface.
        for(String s: characters){
            System.out.print(s);                                       //Descending order is printed
        }
        
    }
    
}

/*
        run:
         Elements: 
        ayqdg
         Sorted in Ascending order Elements: 
        adgqy
         Sorted in Descending order Elements: 
        yqgda
 */