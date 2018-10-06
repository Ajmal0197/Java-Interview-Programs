package interviewprograms;

import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class CountVowelsInString {
    public static void main(String[] args) {
        
        int count=0, count1=0;
        System.out.println("Enter string: ");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();      //Takes the string into str
        char[] chars= str.toCharArray();   //makes string to character array
        
        for(char c: chars){
            
            if(c=='a'|| c=='e'||c=='i'|| c=='o'||c=='u'){
                count++;
            }            
        }
        System.out.println("Number of vowels in String = "+ count);
        
        //Another way
        
        System.out.println("Enter Second String: ");
        String str1= sc.nextLine();      //Takes the string into str
        char[] chars1= str1.toCharArray();   //makes string to character array
        
        for(char c1: chars1){
            switch(c1){
                case 'a':
                case 'e':
                case 'i':    
                case 'o':
                case 'u':
                    count1++;
                    break;
            }
        }
        System.out.println("Number of vowels in String2 = "+ count1);        
    }    
}

/*
    Enter string: 
    qwertyuiop
    Number of vowels in String = 4
    Enter Second String: 
    zxcvbnm
    Number of vowels in String2 = 0
 */