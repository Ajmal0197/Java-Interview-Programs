package interviewprograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class OddEven {
    public static void main(String[] args) {
        
        //BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //Integer in= Integer.parseInt(br.readLine());    //Another way to take input
        
        System.out.println("Enter number to check: ");
        Scanner sc= new Scanner(System.in);
        int in= sc.nextInt();
        
        if(in%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}

/*
    Enter number to check: 
    78
    Number is even

    Enter number to check: 
    19
    Number is odd
 */
