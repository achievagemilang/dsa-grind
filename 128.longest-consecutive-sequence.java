/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        int longestSequence = 1;

        HashSet<Integer> setNums = new HashSet<>();
        for(int n: nums){
            setNums.add(n);
        }

        for(int n : setNums){
            if(setNums.contains(n - 1)){
                continue;
            };
            if(setNums.contains(n + 1)){
                int longestSequenceTmp = 1;
                while(setNums.contains(n + 1)) {
                    longestSequenceTmp++;
                    n++;
                }
                longestSequence = Math.max(longestSequenceTmp, longestSequence);
            }
        }

        return longestSequence;
    }
}
// @lc code=end

/*
 * 1. The idea is to get unique num included in nums (using Set)
 * 2. Once done, we want to iterate from each elements in the set and find their corresponding sequence.
 * 3. Return the maximum longest sequence.
 */