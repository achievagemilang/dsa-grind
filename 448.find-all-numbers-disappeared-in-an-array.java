/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

 import java.util.*;

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int i: nums){
            seen.add(i);
        }

        for (int i=1; i<=n; i++){
            if(!seen.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}

/*
1. Set add occurences in nums
2. Arr to store result
3. Add every missing occurrences
4. return arr 
*/
// @lc code=end

