//Program to print th number Just less or equal to the target number using binary search.
/*
 * Binary Search logic: The binary search searches for the target present in the array as usual, and if found then prints it.
 * if the target element is not found then it prints the element that is at the index which is being ponted by the "start"
 * variable, which by default would be the just smaller element just after the target number(i.e. the number which is just samller
 * than the target number.)
 */



public class FloorNumber {
    static int gretaerOrEqual(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target) {
                return arr[mid];
            }

            if(arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 11;

        System.out.println(gretaerOrEqual(arr, target));
    }
}
