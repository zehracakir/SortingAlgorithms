/* Quick Sort sort logic: First we set a pivot. 
According to the pivot we have determined, the left part is less than and equal to the pivot; those greater than the pivot are written on the right. 
The fragmented parts are pinched by determining a new pivot.
At this point the items are already sorted. All that remains is to combine.

*Average Case = nlogn
*Worst Case = n^2 */
public class QuickSort {
    public static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public void quickSort(int array[], int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);

        }
    }

    public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(array[i] + "");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = { 10, 7, 8, 9, 1, 5 };
        int n = array.length;
        QuickSort qs = new QuickSort();
        qs.quickSort(array, 0, n - 1);

        System.out.println("Quick Sort Array");
        printArray(array);
    }
}
