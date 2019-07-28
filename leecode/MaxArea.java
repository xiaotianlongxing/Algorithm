/**
*盛最多水的容器
**/
public class MaxArea {
     public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            if(height[left] < height[right]){
                maxArea = Math.max(maxArea, height[left] * (right - left));
                left++;
            } else {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                right--; 
            }
        }
        return maxArea;
    }
}
