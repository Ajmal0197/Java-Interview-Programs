package interviewprograms;

/**
 *
 * @author HASAN
 */
public class SumOfNum1to100 {
    public static void main(String[] args) {
        int num=1, sum =0;
        while(num!=101){  // loop from 1-100
            sum= sum+num;
            num++;            
        }
        System.out.println("Sum of 1-100 is: "+ sum);
    }    
}
/*
        run:
        Sum of 1-100 is: 5050
 */