package interviewprograms;

import java.util.Scanner;

/*
1
2 3
4 5 6
7 8 9 10

Here num keeps on increasing, we need two loops one for row and other for col.
 */
public class FloydsTriangle {
    
    public static void main(String[] args) {
        int in, r, c, num=1;
        
        Scanner sc= new Scanner(System.in);
        in= sc.nextInt();       //nextInt() ->Converts string value to int
        
        System.out.println("Floyd's Triangle");
        
        for(r=1; r<=in; r++){    //Print rows
            for(c=1; c<=r; c++)  //Print cols and not exceeds row
            {
                System.out.print(num+"  ");  //dont use "ln" here
                num++;                       //increments num
            }
            System.out.println(" ");
        }
    }
    
}

/*
    Floyads Triangle
    1  
    2  3  
    4  5  6  
    7  8  9  10  
    11  12  13  14  15  
 */
