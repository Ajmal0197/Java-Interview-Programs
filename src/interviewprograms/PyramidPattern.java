/*
12345   5   1 to 5
1234    4   1 to 4
123     3   1 to 3
12      2   1 to 2
1       1   1 to 1
 */
package interviewprograms;

/*
        run:
        12345
        1234
        123
        12
        1
 */
public class PyramidPattern {
    public static void main(String[] args) {
        int row=5;
        for(int i=row; i>0; i--){        //fills row
            for(int j=1; j<=i; j++){     //fills column wise   
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}

/*
        run:
        12345
        1234
        123
        12
        1
 */