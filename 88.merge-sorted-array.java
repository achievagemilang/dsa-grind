/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        while(m > 0 && n > 0){
            if(nums1[m - 1] > nums2[n - 1]){
                nums1[k] = nums1[m - 1];
                m--;
            } else {
                nums1[k] = nums2[n - 1];
                n--;
            }
            k--;

        }

        while(n > 0){
            nums1[k] = nums2[n - 1];
            n--;
            k--;
        }
    }
}
// @lc code=end

/*
 * Idea is to merge from rightside, since the nums1 will be the final value
 * The edge case would be all nums1 > all nums 2, if that's the case fill the remaining nums2 in idx size-m
 * 
 * 
 * TC : O(N)
 */