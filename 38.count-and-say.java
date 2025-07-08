/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(int i=0; i<prev.length(); i++){
            count++;
            if(i == prev.length()-1 || prev.charAt(i) != prev.charAt(i + 1)){
                sb.append(count).append(prev.charAt(i));
                count = 0;
            }
        }

        return sb.toString();
    }
}
// @lc code=end

