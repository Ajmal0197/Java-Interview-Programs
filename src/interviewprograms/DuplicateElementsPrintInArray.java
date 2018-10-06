/*
1. Create and initialise input array.
2. Create an empty set for storing non duplcate elements
3. Create an empty set and name it as duplicate set.
4. Iterate through each element in array and check whether ND contains teh elements. If it is prsesent add it to dplicate set.
5. If it is not present add it to non duplicate set.
6. Finally print elements in duplicate set.
*/

package interviewprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsPrintInArray {
    public static void main(String[] args) {
        String findDuplicate[] = new String[]{"java", "c", "c++", "Python", "java", "python"};
        Set nonDuplicateSet= new HashSet<>();
        Set duplicateSet= new HashSet<>();
        for (String string: findDuplicate) {
            if(!nonDuplicateSet.contains(string)){
                nonDuplicateSet.add(string);
            }
            else{
                duplicateSet.add(string);
            }            
        }
        
        System.out.println(duplicateSet);
    }
}

/**
        run:
        [java]
*/
