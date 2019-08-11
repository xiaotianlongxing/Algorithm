/**
*买卖股票的最佳时机
*动态规划算法
*输入: [7,1,5,3,6,4] 
*输出: 5 
*解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。 
*注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
**/
public class MaxProfit{
    public int maxProfit(int[] prices) {
        int buy = 0;
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[buy])
                buy = i;
            else if (result < prices[i] - prices[buy])
                result = prices[i] - prices[buy];
        }
        return result;
    }
}
