/**
*Given nums = [2, 7, 11, 15], target = 9,
*Because nums[0] + nums[1] = 2 + 7 = 9,
*return [0, 1].
**/
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

