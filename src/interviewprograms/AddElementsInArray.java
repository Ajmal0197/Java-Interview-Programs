package interviewprograms;

import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class AddElementsInArray {
    public static void main(String[] args) {
        
        System.out.println("Enter Size numbers: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        int sum=0;
        
        System.out.println("Enter numbers: ");
        int arr[]= new int[size];
        
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        
        for(int d: arr){
            sum=sum+d;
        }
        
        System.out.println("Sum of Numbers is:  "+ sum);
    }
    
}

/*
        run:
        Enter Size numbers: 
        5
        Enter numbers: 
        2 4 5 6 8 
        Sum of Numbers is:  25
 */