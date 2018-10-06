package interviewprograms;
/*
    Two strings are anagram if they contain same character but in different order.
    Ex: Ajmal mjalA

    Steps:
    1. Take two strings as input value.
    2. Convert first string to character array
    3. Take each character from first string and check its presence in other string, if prsesent get its index and delete that index value.
    4. Repeat for all chars in  first string.
    5. Now check seconfd string length, if its 0 then strings are anagram.
        
        java avaj
        [j,a,v,a]
        Check for j, then a... and so on.
        If present delete by using its index.
 */
public class AnagramCheckUsingStringBuilder {
    public static void main(String[] args) {
        String str1= "Anagram";
        String str2= "graamnA";
        
        System.out.println("String is anagram--> "+ checkAnagram(str1, str2));        
    }
    public static boolean checkAnagram(String str1, String str2){
        char []str1toCharArray= str1.toCharArray();
        StringBuilder sb= new StringBuilder(str2);
        for(char c: str1toCharArray){
            int index= sb.indexOf(String.valueOf(c)); //Taking index in second string by comparing to string1 if present
            if(index!=-1){                            //if each index in 2nd has same values in first
                sb.deleteCharAt(index);               //delete those values
            }
            else{
                return false;
            }            
        }
        return sb.length()==0;                        //check if length beacame 0/not
    }  
}

/*
            run:
        String is anagram--> true
 */
