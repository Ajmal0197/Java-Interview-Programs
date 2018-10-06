package interviewprograms;

import java.util.Scanner;

/*
A string is a palindrome if it remains unchanged when reversed. Eg: DAD, MADAM etc.
 */
public class PalindromeOrNotForString {
    public static void main(String[] args) {

      String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in);
     
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
          
      for (int i = original.length() - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
         
      if (original.equals(reverse))
         System.out.println("The string is a palindrome.");
      else
         System.out.println("The string isn't a palindrome.");
      
      //Checking palindrome for number:
      int number=123454321;
      System.out.println(" \n\nPalindrome 123454321 or Not: "+ checkNumPalindrome(number));
          
      }

    private static boolean checkNumPalindrome(int number) {
        
      int temp=number;
      int mod, reverseNumber=0;
      for(int j=0; j<9; j++){
          mod=temp%10; //1
          reverseNumber=reverseNumber*10+mod; //1*10+1=1
          temp=temp/10;  //12345432
      }
      if(reverseNumber==number){
        return true;
    }
      else{
          return false;
      }
    }
   }

/*
        run:
        Enter a string to check if it is a palindrome
        madam
        The string is a palindrome.


        Palindrome 123454321 or Not: true
 */