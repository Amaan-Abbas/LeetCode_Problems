public class KthNumber {
    public int findKthPositive(int[] arr, int k) {
        int index = 0;

        int[] array = new int[Integer.MAX_VALUE];

        int start = 0, end = Integer.MAX_VALUE;

        while(index < arr.length) {
            boolean value = false;
            while(start <= end) {
                int mid = start + (end - start)/2;

                if(arr[index] == mid) {
                    value = true;
                    index++;
                }

                if(mid < arr[index]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            if(!value) {
                array
            }
        }
    }
}