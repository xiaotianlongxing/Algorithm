/**
*删除排序数组中的重复项
*给定 nums = [0,0,1,1,1,2,2,3,3,4],
*函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
*你不需要考虑数组中超出新长度后面的元素。
**/
public class RemoveDuplicates{
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        // [0...i]区间不包含重复元素, nums[i] == nums[j]
        int i = 0, j = 1;
        for(; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i + 1] = nums[j];
                i++;
            }
        }
        
        return i + 1;
    }
}
