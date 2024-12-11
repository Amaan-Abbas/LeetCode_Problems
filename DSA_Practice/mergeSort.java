package DSA_Practice;

import java.util.Arrays;
public class mergeSort {
    public static void divide(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start)/2;
        divide(array, start, mid);
        divide(array, mid + 1, end);

        conquer(array, start, mid, end);
    }

    public static void conquer(int[] array, int start, int mid, int end) {
        int ind1 = start, ind2 = mid + 1, ind = 0;

        int[] newArray = new int[end - start + 1];

        while(ind1 <= mid && ind2 <= end) {
            if (array[ind1] <= array[ind2]) {
                newArray[ind++] = array[ind1++];
            } else {
                newArray[ind++] = array[ind2++];
            }
        }

        while(ind1 <= mid) {
            newArray[ind++] = array[ind1++];
        }

        while(ind2 <= end) {
            newArray[ind++] = array[ind2++];
        }

        for(int i = 0; i < newArray.length; i++) {
            array[start + i] = newArray[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 12, 10};
        int n = arr.length;

        divide(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
