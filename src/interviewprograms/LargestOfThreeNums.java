package interviewprograms;

import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class LargestOfThreeNums {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        
        if(num1>num2 && num1>num2){
            System.out.println("Largest number is "+ num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Largest number is "+ num2);
        }
        else{
            System.out.println("Largest number is "+ num3);
        }        
    }    
}

/*
    run:
    Enter 3 numbers: 
    22
    44
    11
    Largest number is 44
 */