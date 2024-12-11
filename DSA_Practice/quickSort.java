import java.util.Arrays;
public class quickSort {
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high], i = low - 1;

        for(int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                //swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i;                                   
    }

    public static void quicksort(int[] arr, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(arr, low, high);

            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 1, 11, 5};
        int n = arr.length;

        System.out.println(Arrays.toString(arr));

        quicksort(arr, 0, n - 1);

        System.out.println("The array after quick sort is: ");

        System.out.println(Arrays.toString(arr));
    }
}
