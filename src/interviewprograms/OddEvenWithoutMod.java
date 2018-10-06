package interviewprograms;

import java.util.Scanner;

/*
Even or odd without using modulo operator
Formula-->
(number/2)*2==number     then its even else its odd
 */
public class OddEvenWithoutMod {
    public static void main(String[] args) {
                
        System.out.println("Enter number to check: ");
        Scanner sc= new Scanner(System.in);
        int in= sc.nextInt();
        
        if((in/2)*2==in){
            System.out.println(in+ " is even number.");            
        }
        else{
            System.out.println(in+ " is odd234 number.");            
        }
    }
    
}

/*
    run:
    Enter number to check: 
    234
    234 is even number.
 */