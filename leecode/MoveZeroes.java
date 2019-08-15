/**
*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
*输入: [0,1,0,3,12] 
*输出: [1,3,12,0,0]
**/
public class MoveZeroes{
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i : nums) {
            if (i != 0)
                nums[j++] = i;
        }
        for (int i = nums.length - 1; i >= j; i--)
            nums[i] = 0;
    }
}
