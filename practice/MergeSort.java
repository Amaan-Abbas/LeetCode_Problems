public class MergeSort {
    public void mergeSort(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for(int j = 0; j < n2; j++) {
            right[j] = arr[j + m + 1]; 
        }

        int i = 0, j = 0, k = 1;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void sort(int[]arr, int l, int r) {
        if (l < r) {
            int mid =  l + ( r - l) / 2;

            sort(arr, l, mid);
            sort(arr, mid + 1, r);

            mergeSort(arr, l, mid, r);
        }
    }
}
