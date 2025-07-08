/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int pointer = 0;
        for(int i = freq.length - 1; i >= 0 && pointer < k; i--){
            List<Integer> bucket = freq[i];
            if(bucket.size() != 0){
                for(int element : bucket){
                    ans[pointer] = element;
                    pointer++;
                    if(pointer >= k){
                        return ans;
                    }
                }
            }   
        }

        return ans;
        
    }
}
// @lc code=end

/*
 * 1. Define hash in order to save occurencies in given number
 * 2. Sort the number based on the highest
 * 3. To do that, implement bucket sort, where we sacrifice memory, for fixed sorted place.
 * 4. Extract the top K elements as the answers
 * 
 * TC: O(n)
 */