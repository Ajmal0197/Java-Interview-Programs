package interviewprograms;

/*
    7-> 1,7
    4-> 1,2,4.  ([GivenNumber%i=0]->  4%2=0, 4%4=0) 

    Factors of 4:
    1: 4%1==0 if it 0 then we say 1 is factor.
    2: 4%2==0 if it 0 then we say 2 is factor.
    3: 4%3==0 if it not 0 then we say 1 is not factor.
    4: 4%4==0 if it 0 then we say 4 is factor.
 */
public class FactorsFrom1to100 {
    public static void main(String[] args) {
        int num= 6;
        for(int j=1; j<=num; j++){
            System.out.println("\n Factor of "+ j +" are : ");
            for(int i=1; i<=j; i++){
            if(j%i==0){
                System.out.println(i+"  is factor of "+ j);
            }
//            else {
//                System.out.println(i+ " is not factor of "+ j);
//            }
        }
        }

    }    
}
/*
        run:

         Factor of 1 are : 
        1  is factor of 1

         Factor of 2 are : 
        1  is factor of 2
        2  is factor of 2

         Factor of 3 are : 
        1  is factor of 3
        3  is factor of 3

         Factor of 4 are : 
        1  is factor of 4
        2  is factor of 4
        4  is factor of 4

         Factor of 5 are : 
        1  is factor of 5
        5  is factor of 5

         Factor of 6 are : 
        1  is factor of 6
        2  is factor of 6
        3  is factor of 6
        6  is factor of 6
 */
