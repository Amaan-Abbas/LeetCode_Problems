class DuplicateNumber {

    //the algorithm used is Floyed's Tortoise and Hare algorithm.
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];

        //This step is used to find the loop in the LL(visualised LL of the array)
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        //This step is used to find the starting point of the loop(duplicate present in the array)
        slow = nums[0];
        while (slow != fast) {
            fast = nums[fast];
            slow = nums[slow];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 4, 2};

        DuplicateNumber obj = new DuplicateNumber();

        System.out.println("The duplicate number is " + obj.findDuplicate(nums));
    }
}