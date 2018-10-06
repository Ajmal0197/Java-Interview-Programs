package interviewprograms;

/**
 *
 * @author HASAN
 */
public class Swap2nums {
    public static void main(String[] args) {
        int num1=11, num2=22;
        System.out.println("Number 1 before swapping: "+ num1);
        System.out.println("Number 2 before swapping: "+ num2);
        swapusing3rdvariable(num1, num2);
        swapwithout3rdvariable(num1, num2);
        
    }
    
    public static void swapusing3rdvariable(int num1, int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Number1 after swapping swapusing3rdvariable: "+ num1);
        System.out.println("Number2 after swapping swapusing3rdvariable: "+ num2);    
    }
    
        public static void swapwithout3rdvariable(int num1, int num2){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Number1 after swapping without3rdvariable: "+ num1);
        System.out.println("Number2 after swapping without3rdvariable: "+ num2);          
    }
   
}
/*
        Number 1 before swapping: 11
        Number 2 before swapping: 22
        Number1 after swapping swapusing3rdvariable: 22
        Number2 after swapping swapusing3rdvariable: 11
        Number1 after swapping without3rdvariable: 22
        Number2 after swapping without3rdvariable: 11
 */
