/*
    1. Create arraylist and add elements to arraylist.
    2. Pass the arraylist to Collection.swap method which takes indexes and collection.
 */
package interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayListElements {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(11);  //index: 0
        list.add(22);   //1
        list.add(33);   //2
        list.add(44);   //3
        System.out.println("Elements before swapping: "+ list);
        Collections.swap(list, 1, 3); //list is passed and 1st and 3rd index elements are swapped
        System.out.println("Elements after swapping 22 and 33: "+ list);
    }    
}

/*
        run:
        Elements before swapping: [11, 22, 33, 44]
        Elements after swapping 22 and 33: [11, 44, 33, 22]
 */