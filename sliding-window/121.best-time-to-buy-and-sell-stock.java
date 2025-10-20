
/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2){
            return 0;
        } 
        int l,r;
        l = 0;
        r = 1;

        int maxOutput = 0;
        while (r < prices.length){
            if(prices[l] > prices[r] && l < r){
                l++;
                continue;
            }
            maxOutput = Math.max(maxOutput, prices[r] - prices[l]);
            r++;
        }
        return maxOutput;
    }
}


// @lc code=end

