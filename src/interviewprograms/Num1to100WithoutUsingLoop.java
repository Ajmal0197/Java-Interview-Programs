package interviewprograms;

/**
 *
 * @author HASAN
 */
public class Num1to100WithoutUsingLoop {
    public static void main(String[] args) {
        printNumber(1);
    }
    
    public static void printNumber(int n){
        if(n<=10){
            System.out.print(n+"\t");
            printNumber(n+1);
        }
    }    
}
/*
                run:
        1	2	3	4	5	6	7	8	9	10	
 */


