
package interviewprograms;

import java.util.Arrays;

/*
    *In FS each number is sum of previous two numbers
*/

public class FibonacciSeries {
    public static void main(String[] args) {
    int fibarray[]= new int[10];
    fibarray[0]=0;
    fibarray[1]=1;
    
    for(int i=2; i< fibarray.length; i++){
        fibarray[i]= fibarray[i-1]+fibarray[i-2];
    }
        System.out.printf("Fibonacci series is %s\n", Arrays.toString(fibarray));
        
        //Alternate printin method is below
        
        for(int i: fibarray){
            System.out.print(i+ "\t");
        }
    }
    
}

/*
    Fibonacci series is [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

    0	1	1	2	3	5	8	13	21	34	
 */
