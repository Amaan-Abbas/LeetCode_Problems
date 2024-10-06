/*

You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

 

Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1

TC: O(log(n))
SC: O(1)

 */


public class MountainArray {
    //class Solution {
        public int peakIndexInMountainArray(int[] arr) {
           int start = 0, end = arr.length - 1;
    
           while (start < end) {
    
            int mid  = start + (end - start)/2;
            
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
    
           }
           return start;
        }
    // }
}