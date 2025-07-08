/*
 * @lc app=leetcode id=2206 lang=java
 *
 * [2206] Divide Array Into Equal Pairs
 */

// @lc code=start

import java.util.*;

class Solution {
    public boolean divideArray(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int n = nums[i];
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = it.next();
            int key = pair.getKey(); int val = pair.getValue();

            if (val % 2 != 0) return false;
        }

        return true;
        
    }
}
// @lc code=end

