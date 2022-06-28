import java.util.Arrays;
/* Selection sort algorithm logic:
1-) Finds the smallest element in the pattern and changes the index of the first element with the smallest element.
2-) Since the smallest element is found for 0.index, we now search for the smallest element for the element in the 1.index.
3-) We continue the other steps with the same logic. This way we will sort the pattern from smallest to largest.

*The most important feature of the selection sort is that it does not take up extra space.

*Number of queries = (n*(n+1))/2 */

public class SelectionSort {
    // Let's write a method named selectionSort to be able to sort.
    public void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;

        }
    }

    public static void main(String[] args) {
        int[] array = { 10, 2, 3, 58, 9 };
        SelectionSort selection = new SelectionSort();
        selection.selectionSort(array);
        System.out.println("Sorted by selection sort of the submitted array");
        System.out.println(Arrays.toString(array));
    }
}
