package interviewprograms;

/*
    1. Take input num.
    2. Convert number to string.
    3. Take another string reverse and initialise it to empty.
    4. Extract each character from input string from rightside and add it to rev. var.
    5. Repeat this process for all chars in string.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Integer number=12345;
        System.out.println("Original number(I): "+ number);
        String numberString=String.valueOf(number);
        String reverse="";
        for(int i=numberString.length()-1; i>=0; i--){
            reverse= reverse+numberString.charAt(i);
        }
        System.out.println("Reverse(I): "+ Integer.valueOf(reverse));
        
        System.out.println("Another Way-->");
        int num= 987654321, mod, rev=0;
        System.out.println("Original number(II): "+ num);
        while(num!=0){
            mod=num%10;
            rev=rev*10+mod;
            num=num/10;            
        }
        System.out.println("Reverse(II): "+ rev);
        
    }
}

/*
        run:
        Original number(I): 12345
        Reverse(I): 54321
        Original number(II): 987654321
        Reverse(II): 123456789
 */