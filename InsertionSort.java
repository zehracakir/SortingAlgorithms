/* 
Insertion sort algorithm logic:
* It is assumed that the first element in the array is sorted. 
We take the second element and store it separately in the key.
*Compares the key with the first item.
If the first element is > key, the order would be:
key, first element
*Now the first item is sorted. We take the third item and compare
 it with the items to its left. We place it just after the smaller element. 
 If there is no smaller element, we place it at the beginning of the array. 

Time Complexity= O(N^2) 
Auxiliary Space= O(1)
 */
public class InsertionSort {
    public static void sort(int array[]){
        for(int i=1; i<array.length;i++){
           int key = array[i];
           int j=i-1; 
           while(j>=0 && array[j]>key){
            array[j+1]=array[j];
            j=j-1;
        }
        array[j+1]=key;
        }
      
      
    }
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+"");
        }
        System.out.println();
    }



public static void main(String[] args) {
    int array[]={12,18,3,78,0};
    InsertionSort is=new InsertionSort();
    is.sort(array);
    printArray(array);
}
}