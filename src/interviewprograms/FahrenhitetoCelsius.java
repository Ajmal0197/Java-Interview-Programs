package interviewprograms;

import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class FahrenhitetoCelsius {
    public static void main(String[] args) {
            
        System.out.println("Enter celsius to convert: ");
        Scanner sc= new Scanner(System.in);
        float fh= sc.nextFloat();
        
        fh=((fh-32)*5)/9;
        System.out.println("Celsius is:" + fh);  
}
}

/*
run:
Enter celsius to convert: 
5678
Celsius is:3136.6667
 */
