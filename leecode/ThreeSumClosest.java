/**
*给定包含n个整数数组S，找到S中的三个整数，从而使之和最接近给定的数。返回三个整数的总和。你可以假设每个输入将有一个确切的解决。 
**/
public class threeSumClosest {

   public int threeSumClosest(int[] nums, int target) {

        // 记录最小的差值
        long minDiff = Long.MAX_VALUE;
        // 记录最小差值对应的三个整数和
        long result = 0;
        // 每次求得的差值
        long diff;
        // 每次求得的三个整数的和
        long sum;

        // 先对数组进行排序
        Arrays.sort(nums);


        // i表示假设取第i个数作为结果
        for (int i = 0; i < nums.length - 2; i++) {
            // 第二个数可能的起始位置
            int j = i + 1;
            // 第三个数可能是结束位置
            int k = nums.length - 1;

            while (j < k) {
                // 求当前三个数的和
                sum = nums[j] + nums[k] + nums[i];
                // 当前和与目标和之间的差值
                diff = Math.abs(target - sum);

                // 差值为0就直接返回
                if (diff == 0) {
                    return (int) sum;
                }

                // 如果当前的差值比之前记录的差值小
                if (diff < minDiff) {
                    // 更新最小的差值
                    minDiff = diff;
                    // 更新最小差值对应的和
                    result = sum;

                    // 以上的设置在下一次元素处理时生效
                }


                // 和大于target
                if (sum > target) {
                    k--;
                }
                // 和小于target
                else {
                    j++;
                }
            }
        }

        return (int) result;
    }


}
