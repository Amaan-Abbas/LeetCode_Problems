public class twoSum {
    // public static boolean find(int[] ar, int target) {
    //     int n = ar.length;
    //     int i = 0, j = i + 1;

    //     while(i < n - 1) {
    //         if (ar[i] + ar[j] == target) {
    //             return true;
    //         } else {
    //             j++;
    //         }

    //         if(j == n) {
    //             i++;
    //             j = i + 1;
    //         }
    //     }
    //     return false;
    // }
    //  time complexity = O(n^2)

    public static boolean find(int[] ar, int target) {
        int start = 0, end = ar.length - 1;

        while(start <= end) {
            int sum = ar[start] + ar[end];

            if(sum == target) return true;

            else if(sum < target) start += 1;

            else if(sum > target) end -= 1;
        }

        return false;
    }
    //time complexity = O(n)

    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 50};
        System.out.println("The pair is present: " + find(arr, 70));
    }
}