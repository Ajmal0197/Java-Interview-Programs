package interviewprograms;

/**  Printing number without using any loop (ie through recursion) */

public class PrintNumWithoutAnyLoop {
    
    public static void main(String[] args) {  //this method will run first 
        printNum(1);              //passing intial value
    }
    
    public static void printNum(int n){
        if(n<=10){
            System.out.println(n);//if condition true n's value
            printNum(n+1);        //again call method(recursion) and incremented value is passed
        }
    }
    
}

/*run:
1
2
3
4
5
6
7
8
9
10
BUILD SUCCESSFUL (total time: 0 seconds)
*/