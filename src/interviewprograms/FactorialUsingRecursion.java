/*
        run:
        Factorial of 10 is 3628800
 */
package interviewprograms;

/**
 *
 * @author HASAN
 */
public class FactorialUsingRecursion { 
    public static void main(String[] args) {
        
        System.out.println("Factorial of 10 is "+ factorial(10));
        
    }
    public static int factorial(int fact){
        
        while(fact!=0){
            return fact*factorial(fact-1);
        }
        return 1;
    }

}
