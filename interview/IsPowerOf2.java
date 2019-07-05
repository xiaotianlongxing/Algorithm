package com.interview;

public class IsPowerOf2 {
    /**
     * 用O(1)的时间复杂度判断一个数是否是2的N次幂
     * @param num
     * @return
     */
    
    public static boolean isPowerOf2(int num) {
        return ((num & num - 1) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf2(1024));
    }

}
