/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int bestVal = nums[0], bestLen = 1;
        int l = 0;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[l]) {               
                int len = r - l;
                if (len > bestLen) { 
                    bestLen = len; bestVal = nums[l]; 
                }
                l = r;
            }
        }
        if (nums.length - l > bestLen) bestVal = nums[l];
        return bestVal;
    }
}
// @lc code=end

