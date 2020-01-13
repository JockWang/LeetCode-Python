public class Solution {
    /**
     * 动态规划的思想：
     * 前i天的最大收益 = max(前i-1天的最大收益，第i天的股价-前i-1天中的最小值)
    * */
    public int maxProfit(int[] prices) {
        int max = 0;
        if(prices.length <= 1)
            return max;
        int min = prices[0];
        for(int i = 1; i < prices.length;i ++){
            if(prices[i] - min > max){
                max = prices[i]-min;
            }
            if(min > prices[i])
                min = prices[i];
        }
        return max;
    }
    /**
     * 动态规划：
     *
    * */
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0];
        int res = nums[0];
        for(int i = 1;i < nums.length;i ++){
            if(nums[i] < 0){
                int temp = min;
                min = max;
                max = temp;
            }
            max = Math.max(nums[i]*max, nums[i]);
            min = Math.min(nums[i]*min, nums[i]);
            res = Math.max(max,res);
        }
        return res;
    }
}
