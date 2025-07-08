/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length - 1;
        int goal = n;

        for(int i=n-1; i>=0; i--){
            if(goal <= nums[i] + i){
                goal = i;
            }
        }

        return goal == 0 ? true: false;
    }
}
// @lc code=end

