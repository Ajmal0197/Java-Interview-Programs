package interviewprograms;

import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0); //takes the first input character coz we dont have nextChar() type method.
        
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
            System.out.println(ch +" -> is a character");
        }
        else{
            System.out.println("Not a character");
        }
    }    
}

/*
    run:
    qwertyw1
    q -> is a character
 */