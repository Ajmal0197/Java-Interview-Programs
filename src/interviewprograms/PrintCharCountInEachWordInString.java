package interviewprograms;

/*
Approach:Here we have to find out number of words in a sentence and the corresponding character count of each word.

1. Here first we create an equivalent char array of given String.
2. Now we iterate the char array using for loop. Inside for loop we declare a String with empty implementation.
3. Whenever we found an alphabet we will perform concatination of that alphabet with the String variable and increment the value of i.
4. Now when i reaches to a space it will come out from the while loop and now String variable has the word which is previous of space.
5. Now we will print the String variable with the length of the String.
        E.g: "Hello World"
        Hello->5
        World->5
 */
public class PrintCharCountInEachWordInString{static void count(String str) 
    { 
        // Create an char array of given String 
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) { 
  
            // Declare an String with empty initialization 
            String s = ""; 
  
            // When the character is not space 
            while (i < ch.length && ch[i] != ' ') { 
  
                // concat with the declared String 
                s = s + ch[i];      //""+"A","j","m","a","l"; now since empty space it will pe printed and again for "Hasan" thsi will iterate.
                i++; 
            } 
  
            if (s.length() > 0)  
                System.out.println(s + "->" + s.length());             
        } 
    } 
    public static void main(String[] args) 
    { 
        String str = "Ajmal Hasan"; 
        count(str); 
    } 
} 

/*
        run:
        Ajmal->5
        Hasan->5
*/