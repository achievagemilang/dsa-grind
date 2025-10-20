/*
 * @lc app=leetcode id=2011 lang=java
 *
 * [2011] Final Value of Variable After Performing Operations
 */

// @lc code=start
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String s: operations){
            if(s.contains("+")){
                res++;
            } else{
                res--;
            }
            
        }
        return res;
    }
}
// @lc code=end

