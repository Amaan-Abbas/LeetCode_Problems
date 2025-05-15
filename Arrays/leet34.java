class leet34 {
    public int[] searchRange(int[] nums, int target) {
        int[] index = {-1, -1};
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        index[0] = left;
        index[1] = right;
        return index;
    }

    private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (isSearchingLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }
}