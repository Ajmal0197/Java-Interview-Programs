package interviewprograms;

import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter String to be reversed: ");
        Scanner sc= new Scanner(System.in);
        String string= sc.nextLine();
        String reverse="";
        
        for(int i=string.length()-1; i>=0; i--){
            reverse= reverse+string.charAt(i); //The method charAt(int index) returns the character at the specified index
        }        
        System.out.println("After reversing: "+ reverse);
        
        //Another way
        System.out.println("\nAnother way-->");        
        StringBuffer a = new StringBuffer("Java programming is fun");
        System.out.println(a.reverse());        
    }
    
}

/*
        run:
        Enter String to be reversed: 
        ajmal hasan
        After reversing: nasah lamja

        Another way-->
        nuf si gnimmargorp avaJ
 */
