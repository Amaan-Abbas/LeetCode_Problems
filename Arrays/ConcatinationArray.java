/*Given an integer array nums of length n, you want to create an array ans of length 2n 
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans. 

TC = O(2n)*/

import java.util.Arrays;

public class ConcatinationArray {
    public static  int[] getConcatenation(int[] nums) {
        int j = 0;
        int[] ans = new int[2 * nums.length];

        for(int i = 0; i < 2 * nums.length; i++) {
            if(i > nums.length - 1) {
                ans[i] = nums[j];
                j++;
            }
            else {
                ans[i] = nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] arr = getConcatenation(nums);

        String num = Arrays.toString(arr);
        System.out.println(num);
    }
}
