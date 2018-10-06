/*
    Bubble sort is based on the idea of repeatedly comparing pairs of adjacent elements and then swapping their positions if they exist in the wrong order.
    Assume that  is an unsorted array of  elements. This array needs to be sorted in ascending order/descending order.
    If we have n elements then this sorting technique requires n-1 iteration to sort.
 */
package interviewprograms;

public class BubbleSort {
    public static void main(String[] args) {
        int bsArray[]={9,8,7,5,6};
        System.out.println("Before sorting elements are: ");
        for(int i: bsArray){
            System.out.print(i+ "\t");
        }
        
        bubbleSort(bsArray);
        System.out.println("\nAfter sorting elements are: ");
        for(int i: bsArray){
            System.out.print(i + "\t");
        }
    }
    
    public static void bubbleSort(int[] bsArray){
        int temp=0;  //used for swapping
        for(int i=0; i<bsArray.length; i++){            //5 elements{9,8,7,5,6}
            for(int j=1; j<(bsArray.length)-i; j++)     //If we have n elements then this sorting technique requires n-1 iteration to sort. And also sorting occurs in many phases again and again...
                if(bsArray[j-1]>bsArray[j]){            // "<" for descending order sorting
                    temp=bsArray[j-1];
                    bsArray[j-1]=bsArray[j];
                    bsArray[j]=temp;                    
                }
        }        
    }    
}

/*
        run:
        Before sorting elements are: 
        9	8	7	5	6	
        After sorting elements are: 
        5	6	7	8	9	
 */
