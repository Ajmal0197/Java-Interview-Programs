/*
Just cast your char as an int.

char character = 'a';    
int ascii = (int) character;

In your case, you need to get the specific Character from the String first and then cast it.
char character = name.charAt(0); // This gives the character 'a'
int ascii = (int) character; // ascii is now 97.

Though cast is not required explicitly, but its improves readability.
int ascii = character; 
 */
package interviewprograms;

public class AsciiValuesOfChars {
    public static void main(String[] args) {
        char ch='Z';
        int ascii=ch;
        System.out.println("Ascii of "+ch+ " is: "+ ascii);
    }
    
}


/*
        run:
        Ascii of Z is: 90
 */