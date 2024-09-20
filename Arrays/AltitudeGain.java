/*
 There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

Approach: The function `largestAltitude` finds the highest altitude reached by a biker during a trip. It initializes an 
array, `trip`, to track altitudes at each point, starting with 0. A variable `max` is set to the smallest integer to track 
the highest altitude. The function then calculates altitudes by adding each change in the `gain` array to the previous 
altitude, storing the results in `trip`. Finally, it iterates through the `trip` array to find and return the maximum 
altitude.

TC: O(n)
SC: O(n)
 */

public class AltitudeGain {

    public static int largestAltitude(int[] gain) {
        int[] trip = new int[gain.length + 1];
        trip[0] = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < gain.length ; i++) {
            trip[i + 1] = trip[i] + gain[i];
        }

        for(int i = 0; i < trip.length; i++) {
            if(max < trip[i]) {
                max = trip[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(largestAltitude(gain));
    }
}
