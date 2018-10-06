package interviewprograms;

import java.math.BigInteger;

/*
    3!= 1*2*3=6
 */
public class FactorialofaNumber {
    public static void main(String[] args) {
        int i, fact=1;
        for(i=1; i<=10;i++){
            fact=fact*i;  // 1*2*3*4*5*6*7*8*9*10=?
        }        
        System.out.println("Factorial of 10 is "+fact );
        
        System.out.println("\nFactorial of a Big Integer --> ");
        
        int number=20;
        BigInteger factB=BigInteger.ONE;
        for (int j = 1; j <= number; j++) {
            factB=factB.multiply(BigInteger.valueOf(j));            
        }
        System.out.println("Factorial of a Big Integer 20 is: "+ factB);
        

    }
}
/*
        run:
        Factorial of 10 is 3628800

        Factorial of a Big Integer --> 
        Factorial of a Big Integer 20 is: 2432902008176640000
 */