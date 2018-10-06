package interviewprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author HASAN
 */
public class ArrayDuplicateElementsOrNot {
    public static void main(String[] args) {
            
    String duplicates[]={"java", "c", "python", "java", "c++"};
    List duplicateList=Arrays.asList(duplicates); //Arrays.asList(arr) converts arrays to list.
    Set duplicateSet= new HashSet<>(duplicateList); //storing list items to duplicateSet(Set only store unique elements not duplicates)
    
    if(duplicateList.size()!=duplicateSet.size()){
        System.out.println(duplicateList+ " contains duplicate elements");
    }
    else{
           System.out.println("Not contain duplicate elements");
    }    
}
}

/*
        run:
        [java, c, python, java, c++] contains duplicate elements
 */