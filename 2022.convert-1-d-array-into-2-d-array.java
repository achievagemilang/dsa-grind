/*
 * @lc app=leetcode id=2022 lang=java
 *
 * [2022] Convert 1D Array Into 2D Array
 */

// @lc code=start
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length){
            return new int[][]{};
        }

        int[][] res = new int[m][n];
        
        for (int i=0; i<original.length; i++){
            int r = i / n;
            int c = i % n;
            
            res[r][c] = original[i]; 
        }

        return res;

    }
}

/*
Edge cases;
- Input ga valid: 
    - m*n != original.length
- array kosong: included di input ga valid
- array size 1 -> pasti m * n == 1 which means udah kehandle juga

Then how to approach:
- [0..n-1] -> m[0]
- [n...2(n-1)] -> m[1]
...
- [kn..k2(n-1)] -> m[k]
*/
// @lc code=end

