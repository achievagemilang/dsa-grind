/*
 * @lc app=leetcode id=1663 lang=java
 *
 * [1663] Smallest String With A Given Numeric Value
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public String getSmallestString(int n, int k) {
        k -= n;
        char[] ans = new char[n];
        Arrays.fill(ans, 'a');

        while(k > 0){
            ans[--n] += Math.min(25, k);
            k -= Math.min(25, k);
        }

        return String.valueOf(ans);
    }
}
// @lc code=end

