package com.leecode;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 说明： 你的算法应该具有线性时间复杂度。
 * 你可以不使用额外空间来实现吗？ 示例 1: 输入: [2,2,1] 输出: 1
 * 
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 2, 1, 3, 4, 3,4 };
        System.out.println(singleNumber(arr));
//        System.out.println(1 ^ 2 ^ 1);
    }
}
