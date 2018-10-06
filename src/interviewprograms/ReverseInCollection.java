package interviewprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
    1. Create colln(ArrayList, Sets etc.) obj. and add elements to it.
    2. Pass the obj. to Collection.reverse(obj) method.
 */
public class ReverseInCollection {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("Before swapping:" +list);
        Collections.reverse(list);
        System.out.println("Before swapping:" +list);        
    }
    
}

/*
        run:
        Before swapping:[11, 22, 33, 44, 55]
        Before swapping:[55, 44, 33, 22, 11]
 */
