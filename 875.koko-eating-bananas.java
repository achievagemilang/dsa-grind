/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i : piles){
            if(max < i){
                max = i;
            }
        }
        int l = 1;
        int r = max;

        int ans = r;
        while (l <= r){
            int m = (l + r)/2;

            int curHours = 0;
            for (int i: piles){
                curHours += Math.ceil((double)i / m);
            }

            if (curHours > h){
                l = m + 1;
            } else {
                r = m - 1;
                ans = m;
            }
        }
        return ans;
    }
}
// @lc code=end

/*
 * 1. Solution is to try everything, utilizing binsearch in the process
 * 2. The range of value we want to try is [1..Max(Piles)]
 * 3. We div each calculation by number we try, binary search the answers until it's finished.
 * 
 * TC: O(log(n)*m)
 */
