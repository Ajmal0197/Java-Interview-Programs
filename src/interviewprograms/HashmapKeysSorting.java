package interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
    1. HashMap contains entry(key and value).
    2. Map<Integer,String> map=new HashMap<>();    
    3. map.put(102, "Operating System");
    4. map.remove(102); 
    5. Iteration in map:
        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
        System.out.println(entry.getKey() + "/" + entry.getValue());
        }

    6. Java TreeMap class implements the Map interface by using a tree.
    7. TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
    7. hm.put(100,"Amit");  
 */
public class HashmapKeysSorting {
    public static void main(String[] args) {
//        Map<Integer,String> sortedMap=new HashMap<>();
//        sortedMap.put(3, "Dell");
//        sortedMap.put(2, "Asus");
//        sortedMap.put(6, "Samsung");
//        sortedMap.put(4, "HP");
//        sortedMap.put(1, "Apple");
//        sortedMap.put(5, "Lenovo");
//        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("Unsorted (key, value) pair: "+ key+ " --> " + value);            
//        }          // Will give sorted list

        Map<String,String> unsortedMap=new HashMap<>(); //Will randomly place string values
        unsortedMap.put("Dell", "Dell");
        unsortedMap.put("Asus", "Asus");
        unsortedMap.put("Samsung", "Samsung");
        unsortedMap.put("HP", "HP");
        unsortedMap.put("Apple", "Apple");
        unsortedMap.put("Lenovo", "Lenovo");
        for (Map.Entry<String, String> entry : unsortedMap.entrySet()) {            
            System.out.println("Unsorted key value: "+ entry.getKey());            
        }
        System.out.println("\n");  
                    
        Map<String, String> sortedMap= new TreeMap<>(unsortedMap); //This data structure sorts the map.
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            System.out.println("Sorted key values are: "+ entry.getKey());            
        }
    }    
}
/*
        run:
        Unsorted key value: Lenovo
        Unsorted key value: Dell
        Unsorted key value: Apple
        Unsorted key value: HP
        Unsorted key value: Samsung
        Unsorted key value: Asus


        Sorted key values are: Apple
        Sorted key values are: Asus
        Sorted key values are: Dell
        Sorted key values are: HP
        Sorted key values are: Lenovo
        Sorted key values are: Samsung
*/
