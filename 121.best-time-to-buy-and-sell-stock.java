/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = l+1;
        int max = 0;

        while (r < prices.length){
            int buy = prices[l];
            int sell = prices[r];

            if(buy > sell){
                l = r;
            } else {
                int profit = sell - buy;
                if (max < profit){
                    max = profit;
                } 
            }
            r++;
        }

        return max;
    }
}

// @lc code=end

