package interviewprograms;

import java.util.Scanner;

/**
   Any number which is divisible by 1 and itself is prime else not prime.
 */

public class PrimeorNot {
    public static void main(String[] args) {
        boolean prime=true;   
        int count=1;
        
        System.out.println("Enter number to check: ");
        Scanner sc= new Scanner(System.in);
        int in= sc.nextInt();
        
        
        for(int i=2; i<in; i++){
            if(in%i==0){
                prime = false;
                count++;                
            }
        }
        if(prime==true)
        System.out.println("Number is prime ");
        else
        {
            System.out.println("Number is not prime and it has "+ count+ " factors");
        }
    }
    
}

/*
    Enter number to check: 
    54
    Number is not prime and it has 7 factors

    Enter number to check: 
    29
    Number is prime 

 */
