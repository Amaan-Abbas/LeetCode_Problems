/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

eg: number of elements: 5

Elements: {1, 2, 3, 4, 5}

Output: [1, 3, 6, 10, 15]

*/
import java.util.Arrays;
import java.util.Scanner;

public class RunninggSum {

    public static int[] Runningsum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] arr = new int[nums.length];

        arr = Runningsum(nums);
        
        String num = Arrays.toString(arr);
        System.out.println(num);

        sc.close();
    }
}
