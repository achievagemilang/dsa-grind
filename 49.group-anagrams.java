/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(String str : strs){
            int[] count = new int[26];
            for(int i = 0; i < str.length(); i++){
                count[str.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(count);
            List<String> val = hashMap.getOrDefault(key, new ArrayList<String>());
            val.add(str);
            hashMap.put(key, val);
        }

        return new ArrayList<>(hashMap.values());
    }
}


// @lc code=end

/*
 * 1. First, define map: <key, val> -> <countArray, listOfAnagrams>
 * 2. Loop through strs, count their char occurences using hash. Anagrams should have identical count array.
 * 3. Put the anagram as value in place of the char array
 * 4. Format the answers, make it List of List.
 */

