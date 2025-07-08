/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            if(!hashMap.containsKey(t.charAt(i))) {
                return false;
            }
            hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
            if(hashMap.get(t.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }
}

/*
 * 1. Check if the length is same.
 * 2. Create a hashmap to store the frequency of each character in s.
 * 3. Iterate through t and decrement the frequency of each character in the hashmap.
 * 4. If the frequency of a character is less than 0, return false.
 * 5. If the frequency of a character is greater than 0, return false.
 * 6. Return true.
 * 
 * TC: O(n)
 */

// @lc code=end

