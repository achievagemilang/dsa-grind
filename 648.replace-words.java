/*
 * @lc app=leetcode id=648 lang=java
 *
 * [648] Replace Words
 */

// @lc code=start

import java.util.HashSet;
import java.util.List;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> dict = new HashSet<>();
        for(String s: dictionary){
            dict.add(s);
        }

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String w: words){
            boolean isReplaced = false;
            for(int i=0; i<w.length(); i++){
                String sub = w.substring(0, i+1);
                if (dict.contains(sub)) {
                    sb.append(sub).append(" ");
                    isReplaced = true;
                    break;
                }
            }
            if(!isReplaced){
                sb.append(w).append(" ");
            }
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
// @lc code=end

/*
 * 1. Idea is to check if we can change the words in our dictionary, one-by-one
 * 2. First, we make set of dictionaries given by the question
 * 3. The we split the string input by whitespace
 * 4. Loop until we find the shortest contained word in dictionary replace them in the stringbuilder
 * 5. If we haven't found until the word is end, we just append the word.
 * 6. Return thee string builder
 */
