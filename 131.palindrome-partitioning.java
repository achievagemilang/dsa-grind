/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> part = new ArrayList<>();
        dfs(0, s, part, ans);
        return ans;
    }

    public void dfs(int i, String s, List<String> part, List<List<String>> ans){
        if(i >= s.length()){
            ans.add(new ArrayList<>(part));
            return;
        }

        for(int j = i; j < s.length(); j++){
            if(isPali(s, i, j)){
                String sub = s.substring(i, j+1);
                part.add(sub);
                dfs(j + 1, s, part, ans);
                part.remove(part.size() - 1);
            }
        }
    }

    public boolean isPali(String s, int l, int r){
        while (l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
// @lc code=end

