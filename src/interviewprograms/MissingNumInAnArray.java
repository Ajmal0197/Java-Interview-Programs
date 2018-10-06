package interviewprograms;

import java.util.Arrays;

/*
*   Let {1,2,3,4,6}:  But Actual size=6 since one missing.(Here 5 is missing).
*   Calculate Expected Total=> n(n+1)/2 = 6*7/2 = 21.
*   Actual total = 1+2+3+4+6= 16.
*   Missing num= ET-At= 21-16= 5.
 */
public class MissingNumInAnArray {
    
    public static void main(String[] args) {
        int array[]= {1,2,3,4,6};
        int missingArray= getMissingArray(array, 6);// or getMissingArray(array, array.length+1)
        System.out.printf("Missing number in array %s is %d \n ", Arrays.toString(array), missingArray);
    }
    public static int getMissingArray(int []array, int n){
        int actualSum=0;
        int expectedSum=n*(n+1)/2;
        for(int i: array){
            actualSum=actualSum+i;
        }
        return expectedSum-actualSum;
    }
}

/*
    run:
Missing number in array [1, 2, 3, 4, 6] is 5 
BUILD SUCCESSFUL (total time: 0 seconds)
 */