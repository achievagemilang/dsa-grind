/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start

import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n: nums){
            set.add(n);
        }

        for (int i=0; i<=nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
    }
}
// @lc code=end

