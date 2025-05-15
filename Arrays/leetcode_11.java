class leetcode_11 {
    //11. Container With Most Water
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1; //two pointers
        //i = left pointer, j = right pointer
        int area = Integer.MIN_VALUE;   //area = max area

        while (i < j) {
            int length = j - i;
            int breadth = Math.min(height[i], height[j]);

            if (area < length * breadth) area = length * breadth;

            //To check which pointer to move, we need to find the smaller height
            //because the area is limited by the smaller height
            if(height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return area;
    }
}