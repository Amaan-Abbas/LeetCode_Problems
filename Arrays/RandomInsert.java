/*
 
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

 

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]


TC : O(n^2)
SC : O(1)


Approach: Using first loop for ccessing the values of array num and index. Using the other loop for shifting the terms of ans array to the right for
accomodating the new element at the index specified by index[i].

Note: TC can be improven.

 */



public class RandomInsert {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans  = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
                for (int j = ans.length - 1; j > index[i]; j--) {
                    ans[j] = ans[j - 1]; 
                }
                ans[index[i]] = nums[i];
        }
        return ans;
    }
}