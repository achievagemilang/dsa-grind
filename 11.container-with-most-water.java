/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r){
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            int area = w * h;

            max = Math.max(max, area);

            if(height[l] < height[r]){
                l++;
            } else{
                r--;
            }
        }

        return max;
    }
}
// @lc code=end

