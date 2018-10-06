/*
Sum, average, multiplication of n numbers using user input.
 */

package interviewprograms;

import java.util.Scanner;

public class AddMulAvgofNnums { public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        int sum=0, mul=1;
        System.out.println("1-Sum");
        System.out.println("2-Average");
        System.out.println("3-Multiplication");
        System.out.println("Enter your choice from 1/2/3");
        int choice=sc.nextInt(); //to use in switch
        
        System.out.println("Now Enter numbers separated by comma: ");
        String inputNumbers= sc.next(); // will take numbers as string coz we want to use "," also
        String numbersArr[]= inputNumbers.split(","); //split numbers by "," and store them in Array
        
        for(int i=0; i<numbersArr.length; i++){
            sum=sum+Integer.parseInt(numbersArr[i]);  //since numbers is stored as string
        }
        
        switch(choice){
            case 1: System.out.println("Sum is: "+ sum);    break;
            case 2: System.out.println("Average is: "+ (sum/numbersArr.length));    break;
            case 3: for(String str: numbersArr){
                        mul=mul*Integer.parseInt(str);
                    }
                    System.out.println("Product is: "+ mul);    break;
            default: System.out.println("Choose from 1/2/3");    break;
        }        
    }
}

/*
        run:
        1-Sum
        2-Average
        3-Multiplication
        Enter your choice from 1/2/3: 
        3
        Now Enter numbers separated by comma: 
        1,4,6,8,9,88
        Product is: 152064
*/
