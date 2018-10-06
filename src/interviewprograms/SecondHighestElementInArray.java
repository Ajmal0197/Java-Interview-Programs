package interviewprograms;

import java.util.Arrays;

/*
*   Let [1,20,5,6,16,10]
*   Sort this array first= [1,5,6,10,16,20]
*   array.length-1 gives largest number;
*   array.length-2 gives  2nd largest number;
 */
public class SecondHighestElementInArray {
    public static void main(String[] args) {
        int array[]={1,20,5,6,16,10};
        Arrays.sort(array); // sorts in ascending order
        System.out.println("Highest element is "+ array[array.length-1]);  //index passed so gives element and (length>lastindex)       
        System.out.println("Second Highest element is "+ array[array.length-2]);
    }
    
}

/*
    Highest element is 20
    Second Highest element is 16
 */
