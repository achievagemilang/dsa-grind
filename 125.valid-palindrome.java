/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start

class Solution {
    public boolean isPalindrome(String s) {
        int l, r, n;

        n = s.length();
        r = n - 1;
        l = 0;

        while (l < r){
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if(Character.toUpperCase(s.charAt(l)) == Character.toUpperCase(s.charAt(r))){
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

/*
 * The idea is simple -> Use Stack
 * Loop through until pivot, until then push the elements;
 * Once you arrived at pivot, start popping
 * Pivot is n / 2
 * 
 * There are 2 conditions:
 * Even: n / 2 is the pivot 
 * Odd: n / 2 would be skipped, we start popping at (n / 2) + 1
 * 
 * TC: O(n)
 */

