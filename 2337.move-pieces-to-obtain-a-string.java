/*
 * @lc app=leetcode id=2337 lang=java
 *
 * [2337] Move Pieces to Obtain a String
 */

// @lc code=start


class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0, j = 0;

        while (i < n || j < n) {
            while (i < n && start.charAt(i) == '_') i++;
            while (j < n && target.charAt(j) == '_') j++;

            if (i == n && j == n) return true;

            if (i == n || j == n) return false;

            if (start.charAt(i) != target.charAt(j)) return false;

            if (start.charAt(i) == 'L' && i < j) return false;
            if (start.charAt(i) == 'R' && i > j) return false;

            i++;
            j++;
        }

        return true;
    }
}
// @lc code=end

/*
 * 1. The idea is we wanted to trim '_' in start and target, and only focuses on the character `L` or `R`.
 * 2. Define 2 pointer `i` -> `start` and `j` -> `target`:
 *      - transformation is valid iff `i` and `j` is in the same position `n`
 *      - transformation is not valid otherwise
 * 3. Make sure you're comparing the same character.
 * 4. Make sure the movements is valid:
 *      - L can only move Left, which means i > j
 *      - R can only move right, which means i < j
 * 5. Check on the next character;
 * 
 * 
 * TC : O(n)
 */

