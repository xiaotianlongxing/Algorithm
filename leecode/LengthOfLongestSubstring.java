package com.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters 
 * 
 * Given "abcabcbb", the answer is "abc", which the length is 3. 
 * Given "bbbbb", the answer is "b", with the length of 1. 
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * @author Administrator
 *
 */
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring2(String s) {

        int maxL = 0;   //记录最大子串的长度
        Map<Character,Integer> hashmap = new HashMap<Character,Integer>();
        int i=0,j=0;    //滑动窗口的起点和终点
        while(i<s.length() && j<s.length()){

            if(!hashmap.containsKey(s.charAt(j))){
                hashmap.put(s.charAt(j), j);
                maxL = Math.max(maxL,j-i+1);
                j++;
            }else{
                int index = hashmap.get(s.charAt(j));  //获取重复字符的索引
                for(int k=i;k<=index;k++){
                    hashmap.remove(s.charAt(k));
                }
                i = index +1;   
            }
        }
        return maxL;
    }
}
