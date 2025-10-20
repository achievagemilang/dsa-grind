/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])) {
                return true;
            }
            hashMap.put(nums[i], 1);
        }

        return false;
    }
}
// @lc code=end

