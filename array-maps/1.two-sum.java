/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            hashIndex.putIfAbsent(num, i);
        }

        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hashIndex.containsKey(diff) && hashIndex.get(diff) != i){
                if (i != hashIndex.get(diff)) {
                    ans[0] = i;
                    ans[1] = hashIndex.get(diff);
                    break;
                }
            }
        }

        return ans;
    }
}
/*
 * 1. First, we make a map for hashing. Save their occurences by index.
 * 2. Iterate through i in nums[i].
 * 3. Have a `diff` var to preserve the remaining calculation in order to reach target.
 * 4. Check if `diff` is in our hashmap.
 * 5. Make sure it's not using duplicate value.
 * 5. If it's exists, then return the pair.
 * 6. If not, check for the next i in nums[i] in the iteration.
 * 
 * TC: O(n)
 */
// @lc code=end

