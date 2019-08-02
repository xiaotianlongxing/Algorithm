public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] < target)
                left = mid + 1;
            else if (target < nums[mid])
                right = mid;
            else
                return mid;
        }
        return left;
    }
}
